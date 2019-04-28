package com.dk.i18n.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @title: MessageResourceExtension
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 16:55
 */
@Component("messageSource")
public class MessageResourceExtension extends ResourceBundleMessageSource {
    private final static Logger logger = LoggerFactory.getLogger(MessageResourceExtension.class);

    /**
     * 指定的国际化文件目录
     */
    @Value(value = "${spring.messages.baseFolder:i18n}")
    private String baseFolder;

    /**
     * 父MessageSource指定的国际化文件
     */
    @Value(value = "${spring.messages.basename:message}")
    private String basename;

    public static String I18N_ATTRIBUTE = "i18n_attribute";

    @Override
    protected String resolveCodeWithoutArguments(String code, Locale locale) {
        // 获取request中设置的指定国际化文件名
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        final String i18File = (String) attr.getAttribute(I18N_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST);
        if (!StringUtils.isEmpty(i18File)) {
            System.out.println(ColourAnsiUtil.BACKGROUND_YELLOW+i18File);
            //获取在basenameSet中匹配的国际化文件名
            String basename = getBasenameSet().stream()
                    .filter(name -> StringUtils.endsWithIgnoreCase(name, i18File))
                    .findFirst().orElse(null);
            if (!StringUtils.isEmpty(basename)) {
                //得到指定的国际化文件资源
                ResourceBundle bundle = getResourceBundle(basename, locale);
                if (bundle != null) {
                    return getStringOrNull(bundle, code);
                }
            }
        }
        //如果指定i18文件夹中没有该国际化字段,返回null会在ParentMessageSource中查找
        return null;
    }

    @PostConstruct
    public void init() {
        logger.info("init MessageResourceExtension...");
        if (!StringUtils.isEmpty(baseFolder)) {
            try {
                this.setBasenames(getAllBaseNames(baseFolder));
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }

        //设置父MessageSource
        ResourceBundleMessageSource parent = new ResourceBundleMessageSource();
        parent.setBasename(basename);
        this.setParentMessageSource(parent);
    }

    /**
     * 获取文件夹下所有的国际化文件名(就是各个配置文件的上级文件夹)
     *
     * @param folderName 文件名
     * @return
     * @throws IOException
     */
    private String[] getAllBaseNames(String folderName) throws IOException {
        Resource resource = new ClassPathResource(folderName);
        File file = resource.getFile();
        List<String> baseNames = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            this.getAllFile(baseNames, file, "");
        } else {
            logger.error("指定的baseFile不存在或者不是文件夹");
        }

        System.out.println("最终加载到的国际化文件baseNames:=>"+baseNames);

        return baseNames.toArray(new String[baseNames.size()]);
    }

    /**
     * 遍历所有文件
     *
     * @param basenames
     * @param folder
     * @param path
     */
    private void getAllFile(List<String> basenames, File folder, String path) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                this.getAllFile(basenames, file, path + folder.getName() + File.separator);
            }
        } else {
            String i18Name = this.getI18FileName(path + folder.getName());
            System.out.println(ColourAnsiUtil.DARK_GREEN+path + folder.getName());basenames.add(i18Name);
            //把没有添加的国际化文件添加进去
            if (!basenames.contains(i18Name)) {
                basenames.add(i18Name);
            }
        }
        System.out.println("遍历所有文件folder:=>"+folder);
    }

    /**
     * 把普通文件名转换成国际化文件名
     * eg：
     * @param filename
     * @return
     */
    private String getI18FileName(String filename) {
        filename = filename.replace(".properties", "");
        System.out.println(ColourAnsiUtil.DARK_RED+filename);
        for (int i = 0; i < 2; i++) {
            int index = filename.lastIndexOf("_");
            if (index != -1) {
                filename = filename.substring(0, index);
            }
        }
        System.out.println(ColourAnsiUtil.YELLOW+"国际化文件名filename:=>"+filename);
        return filename.replace("\\", "/");
    }

}
