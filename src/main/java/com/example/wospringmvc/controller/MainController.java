package com.example.wospringmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

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


}
