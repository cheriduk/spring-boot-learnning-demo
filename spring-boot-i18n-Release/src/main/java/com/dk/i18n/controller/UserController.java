package com.dk.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @title: UserController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 21:52
 */
@Controller
public class UserController {
    @GetMapping("user2")
    public String user() {
        return "system/user";
    }
}