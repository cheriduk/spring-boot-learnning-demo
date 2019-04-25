package com.dk.blog.model;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Cheri
 * @title: RoleBean
 * @projectName spring-boot-learnning
 * @description: 角色类
 * @date 2019/4/230:09
 */
@Data
public class RoleBean implements Serializable {
    private String id;
    private String name;
    private Set<PermissionBean> permissions = new HashSet<>();
}
