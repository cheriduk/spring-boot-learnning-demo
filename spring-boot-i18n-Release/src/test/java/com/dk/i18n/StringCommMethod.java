package com.dk.i18n;

/**
 * @title: StringCommMethod
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 18:42
 */
public class StringCommMethod {

    public static void main(String[] args) {
        String fileName = "i18n\\messages_en_US";
        int index = fileName.lastIndexOf("_");
        System.out.println(fileName.length());
        System.out.println(index);
    }
}
