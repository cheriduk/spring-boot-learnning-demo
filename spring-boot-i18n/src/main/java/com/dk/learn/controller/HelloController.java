package com.dk.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @title: HelloController
 * @projectName spring-boot-learnning
 * @Description: 控制器
 * @Auther: Cheri
 * @Date: 2019/4/27 18:01
 */
//此处一定是Controller,如果是RestController，或者加上@ResponseBody，只能返回文本
@Controller
public class HelloController {
//也可以在这里写一个方法配置login页，不用写config中的webMvcConfigurerAdapter
//    @RequestMapping({"/","login.html"})
//    public String login(){
//        return "Login";
//    }


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","原来是@RestController的问题");
        return "index";
    }
}

