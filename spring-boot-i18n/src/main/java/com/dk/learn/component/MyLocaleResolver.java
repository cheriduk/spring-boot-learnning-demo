package com.dk.learn.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @title: MyLocaleResolver
 * @projectName spring-boot-learnning
 * @Description:
 * @Auther: Cheri
 * @Date: 2019/4/27 18:00
 */
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取我们自己传入的参数
        String parameter = httpServletRequest.getParameter("l");
        //如果没有传入，就返回默认的
        Locale locale  = Locale.getDefault();
        if(!StringUtils.isEmpty(parameter)){
            String[] split = parameter.split("_");
            locale= new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}

