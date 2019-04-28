package com.dk.i18n;

import com.dk.i18n.commons.MessageResourceInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import static java.awt.Color.*;

/**
 * @title: I18nUseApplication
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 15:18
 */
@SpringBootApplication
public class I18nUseApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18nUseApplication.class,args);

    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            //拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LocaleChangeInterceptor()).addPathPatterns("/**");
                registry.addInterceptor(new MessageResourceInterceptor()).addPathPatterns("/**");
            }
        };
    }
}
