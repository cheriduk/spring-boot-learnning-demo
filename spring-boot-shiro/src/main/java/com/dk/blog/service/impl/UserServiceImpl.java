package com.dk.blog.service.impl;

import com.dk.blog.mapper.UserMapper;
import com.dk.blog.model.UserBean;
import com.dk.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title: UserServiceImpl
 * @projectName spring-boot-learnning
 * @Description: UserService实现类
 * @Auther: Cheri
 * @Date: 2019/4/23 01:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean findByName(String name) {
        // 查询用户是否存在
        UserBean bean = userMapper.findByName(name);
        if (bean != null) {
            // 查询用户信息、角色、权限
            bean = userMapper.findById(bean.getId());
        }
        return bean;
    }
}
