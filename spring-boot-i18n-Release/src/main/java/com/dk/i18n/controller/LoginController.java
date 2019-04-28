package com.dk.i18n.controller;

import com.dk.i18n.annotation.I18n;
import com.dk.i18n.commons.MessageResourceExtension;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @title: LoginController
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Author Cheri
 * @Date: 2019/4/28 15:31
 */
@Controller
public class LoginController {
//1.
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }
//2.
//    @GetMapping("/user")
//    public String index(HttpServletRequest request) {
//        request.setAttribute(MessageResourceExtension.I18N_ATTRIBUTE, "user");
//        return "system/user";
//    }
//
//    @GetMapping("/dashboard")
//    public String dashboard(HttpServletRequest request) {
//        request.setAttribute(MessageResourceExtension.I18N_ATTRIBUTE, "dashboard");
//        return "dashboard";
//    }
//
//    @GetMapping("/login")
//    public String merchant(HttpServletRequest request) {
//        request.setAttribute(MessageResourceExtension.I18N_ATTRIBUTE, "login");
//        return "login";
//    }
    //3.

    @I18n("user")
    @GetMapping("/user")
    public String index() {
        return "system/user";
    }

    @I18n("dashboard")
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @I18n("login")
    @GetMapping("/login")
    public String merchant() {
        return "login";
    }


}
