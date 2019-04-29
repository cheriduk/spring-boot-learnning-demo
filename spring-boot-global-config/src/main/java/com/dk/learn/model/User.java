package com.dk.learn.model;

import java.util.Date;

/**
 * @title: User
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/29 01:34
 */
public class User {

    private String userId;
    private String username;
    private String password;
    private Date createTime;
    private String timezone;

    public User(String userId, String username, String password, Date createTime, String timezone) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.timezone = timezone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}