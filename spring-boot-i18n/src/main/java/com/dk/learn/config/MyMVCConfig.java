package com.dk.learn.config;

import com.dk.learn.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @title: MyMVCConfig
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/27 18:01
 */
@Configuration
public class MyMVCConfig extends WebMvcConfigurerAdapter {
    @Bean//将组件注册到容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new  WebMvcConfigurerAdapter(){

            @Override
            public void addViewControllers(ViewControllerRegistry registry){

                //浏览器发送 /，/index.html最后都会到login
                registry.addViewController( "/").setViewName("login");
                registry.addViewController( "/index.html").setViewName("login");
            }
        };
        return  adapter;
    }
    //注册我们自己写的国际化设置
    @Bean//必须的
    public LocaleResolver localeResolver(){
        return  new MyLocaleResolver();
    }
}

