package com.dk.learn.service;

import com.dk.learn.model.Person;

/**
 * @title: PersonService
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 19:00
 */
public interface PersonService {
    Person save(Person person);
    void remove(Long id);
    Person findOne(Person person);
}
