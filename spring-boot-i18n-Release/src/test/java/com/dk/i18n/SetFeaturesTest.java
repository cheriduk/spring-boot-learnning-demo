package com.dk.i18n;

import java.util.HashSet;
import java.util.Set;

/**
 * @title: SetFeaturesTest
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 21:39
 */
public class SetFeaturesTest {

    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");
        System.out.println(set);
    }
}
