package com.dk.i18n.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;

/**
 * @title: I18nConfig
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 16:11
 */
@Configuration
public class I18nConfig {

    @Bean
    public LocaleResolver localeResolver() {
        //采用cookie来控制国际化的语言
        //CookieLocaleResolver：根据cookie数据获取国际化数据，
        // 但是如果用户禁止或没有设置cookie，就会根据http头中的accept-language来获取
        CookieLocaleResolver slr = new CookieLocaleResolver();
        // 设置超时秒数
        slr.setCookieMaxAge(10);
        //设置存储的Cookie的name为Language
        //slr.setCookieName("Language");
        slr.setCookieDomain("Language1");
        // 默认使用简体中文
        //slr.setDefaultLocale(Locale.SIMPLIFIED_CHINESE);
        return slr;
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            //拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //LocaleChangeInterceptor拦截器来拦截国际化语言的变化
                //通过LocaleChangeInterceptor可以获取参数，然后根据参数来改变区域
                registry.addInterceptor(new LocaleChangeInterceptor()).addPathPatterns("/**");
            }
        };
    }
}
