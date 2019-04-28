package com.dk.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: HelloController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/27 21:57
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String hello(){
        return "user/login";
    }
}
