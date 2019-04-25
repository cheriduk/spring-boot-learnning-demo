package com.dk.learn.repository;

import com.dk.learn.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title: PersonRepository
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 19:03
 */

public interface PersonRepository extends JpaRepository<Person, Long> {
}
