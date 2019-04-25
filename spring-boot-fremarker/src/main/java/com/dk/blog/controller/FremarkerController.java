package com.dk.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title: FremarkerController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/23 21:50
 */
@Controller
public class FremarkerController {
    @RequestMapping("/list")
    public String index(Map<String, Object> result) {
        result.put("name", "jhp");

        // 模拟数据
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "wangli");
        friend.put("age", 28);
        friend.put("love","编程");
        friends.add(friend);

        friend = new HashMap<String, Object>();
        friend.put("name", "guoyanbin");
        friend.put("age", 29);
        friend.put("love","打游戏");
        friends.add(friend);

        friend = new HashMap<String, Object>();
        friend.put("name", "yaodong");
        friend.put("age", 26);
        friend.put("love","深蹲");
        friends.add(friend);

        result.put("friends", friends);

        return "list";
    }
}