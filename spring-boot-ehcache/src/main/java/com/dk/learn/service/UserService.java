package com.dk.learn.service;

import com.dk.learn.model.User;

/**
 * @title: UserService
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 17:15
 */
public interface UserService {

    public User findByName(String name);
}
