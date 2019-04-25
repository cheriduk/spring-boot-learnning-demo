package com.dk.learn.service.impl;

import com.dk.learn.model.User;
import com.dk.learn.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @title: UserServiceImpl
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 17:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(cacheNames = {"users"},keyGenerator = "keyGenerator")
    public User findByName(String name) {

        System.out.println("UserServiceImpl findByName()执行,name="+name);

        if ("1".equals(name)){
            return new User("1","zuli");
        }else if ("2".equals(name)){
            return new User("2","zuli1");
        }

        return null;

    }

}
