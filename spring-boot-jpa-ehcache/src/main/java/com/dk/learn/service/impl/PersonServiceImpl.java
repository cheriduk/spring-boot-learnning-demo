package com.dk.learn.service.impl;

/**
 * @title: PersonServiceImpl
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 19:00
 */
import com.dk.learn.model.Person;
import com.dk.learn.repository.PersonRepository;
import com.dk.learn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为:" + p.getId() + "数据做了缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "people")//2
    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        //这里不做实际删除操作
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")//3
    public Person findOne(Person person) {
        //Person p = personRepository.findOne(person.getId());
        Person p =  personRepository.findById(person.getId()).get();
        System.out.println("为id、key为:" + p.getId() + "数据做了缓存");
        return p;
    }
}