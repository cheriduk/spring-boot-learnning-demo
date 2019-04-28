package com.dk.i18n.controller;

import com.dk.i18n.annotation.I18n;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @title: ShopController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 21:52
 */
@I18n("shop")
@Controller
public class ShopController {
    @GetMapping("shop")
    public String shop() {
        return "shop";
    }
}