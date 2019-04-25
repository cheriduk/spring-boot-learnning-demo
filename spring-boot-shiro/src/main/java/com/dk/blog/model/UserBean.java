package com.dk.blog.model;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Cheri
 * @title: UserBean
 * @projectName spring-boot-learnning
 * @description: 用户类
 * @date 2019/4/230:07
 */
@Data
public class UserBean implements Serializable {
    private String id;
    private String name;
    private String password;
    private Set<RoleBean> roles = new HashSet<>();

}
