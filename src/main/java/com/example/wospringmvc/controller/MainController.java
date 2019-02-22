package com.example.wospringmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @Autowired
    private HttpSession session;


    @RequestMapping("/")   //매핑
    public String index(){
        return "index";
    }


    @GetMapping("/joinPage")  //joinPage
    public String joinPage(){
            return "join";
    }

    @GetMapping("/loginPage")  //loginPage
    public String loginPage(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        session.invalidate();
        return "index";
    }
}
