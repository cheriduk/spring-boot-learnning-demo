package com.dk.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @title: JdbcController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 17:56
 */
@RestController
@RequestMapping("/jdbc_ehcache")
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/all")
    @Cacheable(cacheNames = {"users"},keyGenerator = "keyGenerator")
    public List<Map<String,Object>> queryUsers(){
        System.out.println("all--------------##################》》》");
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from shiro_user ");
        System.out.println(list);
        return list;
    }

}
