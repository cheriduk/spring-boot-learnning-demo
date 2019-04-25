package com.dk.blog.mapper;

import com.dk.blog.ShiroDemoApplication;
import com.dk.blog.model.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Cheri
 * @title: UserMapperTest
 * @projectName spring-boot-learnning
 * @description: TODO
 * @date 2019/4/230:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShiroDemoApplication.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test01(){
        UserBean user = userMapper.findByName("2");
        System.out.println(user);
    }
}
