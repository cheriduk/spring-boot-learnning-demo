package com.dk.blog.service;

import com.dk.blog.model.UserBean;

/**
 * @author Cheri
 * @title: UserService
 * @projectName spring-boot-learnning
 * @description:  UserService抽象接口
 * @date 2019/4/2223:24
 */

public interface UserService {
    UserBean findByName(String name);
}
