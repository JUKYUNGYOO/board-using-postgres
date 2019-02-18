package com.example.wospringmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")   //매핑
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/joinPage")  //joinPage
    public String joinPage(){
            return "join";
    }
}
