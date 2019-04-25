package com.dk.blog.mapper;

import com.dk.blog.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Cheri
 * @title: UserMapper
 * @projectName spring-boot-learnning
 * @description: TODO
 * @date 2019/4/230:12
 */
@Mapper
public interface UserMapper {

    // 查询用户信息
    UserBean findByName(String name);

    // 查询用户信息、角色、权限
    UserBean findById(String id);
}
