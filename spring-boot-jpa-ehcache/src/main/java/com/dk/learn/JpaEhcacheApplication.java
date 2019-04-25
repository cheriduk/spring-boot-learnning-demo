package com.dk.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @title: JpaEhcacheApplication
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 19:31
 */
@SpringBootApplication
@EnableCaching// 开启缓存，需要显示的指定
public class JpaEhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaEhcacheApplication.class,args);
    }
}
