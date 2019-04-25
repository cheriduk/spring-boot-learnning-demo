package com.dk.blog.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cheri
 * @title: PermissionBean
 * @projectName spring-boot-learnning
 * @description: 权限类
 * @date 2019/4/230:11
 */
@Data
public class PermissionBean implements Serializable {
    private String id;
    private String name;
    private String url;
}
