package com.dk.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: HelloController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/28 00:23
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
