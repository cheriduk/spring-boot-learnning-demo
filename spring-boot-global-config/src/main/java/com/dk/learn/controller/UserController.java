package com.dk.learn.controller;

import com.dk.learn.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @title: UserController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/29 01:33
 */
@RestController
public class UserController {
    @GetMapping("/")
    public User get() {
        String[] s = {"1"};
        String s1 =s [2];
        return new User("1", "socks", "123456", new Date(), "GMT");
    }
}
