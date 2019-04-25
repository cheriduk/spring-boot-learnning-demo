package com.dk.blog.controller;

/**
 * @title: ThhmeleafController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/23 21:20
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author 18011618
 * @Description
 * @Date 11:14 2018/7/13
 * @Modify By
 */
@Controller
public class ThymeleafController {
    /**
     * 返回html模板.
     */
    @RequestMapping("/list")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","wecome to thymeleaf world!");
        return "hello";
    }
}
