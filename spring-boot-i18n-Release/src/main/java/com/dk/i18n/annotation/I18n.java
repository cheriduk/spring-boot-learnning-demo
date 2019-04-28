package com.dk.i18n.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @title: I18n
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 21:46
 */
@Target({ElementType.TYPE, ElementType.METHOD})//作用域 类与方法上
@Retention(RetentionPolicy.RUNTIME)//生命周期 -》运行时
public @interface I18n {
    /**
     * 国际化文件名
     */
    String value();
}
