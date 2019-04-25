package com.dk.learn;

import com.dk.learn.model.User;
import com.dk.learn.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

/**
 * @title: com.dk.learn.EchcacheApplication
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 15:37
 */
@SpringBootApplication
@EnableCaching//开启缓存
public class EchcacheApplication {

    @Bean
    public KeyGenerator keyGenerator() {

        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for (Object obj : params) {
                    if (obj != null) {
                        sb.append(obj.toString());
                    }
                }

                return sb.toString();
            }

        };
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(EchcacheApplication.class, args);
        UserService userService = context.getBean(UserService.class);

        User user1 =  userService.findByName("1");
        System.out.println(user1);
        User user11 =  userService.findByName("1");
        System.out.println(user11);
        User user2 = userService.findByName("2");
        System.out.println(user2);
        User user22 = userService.findByName("2");
        System.out.println(user22);

    }
}



