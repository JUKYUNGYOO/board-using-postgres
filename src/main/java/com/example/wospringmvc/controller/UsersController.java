package com.example.wospringmvc.controller;


import com.example.wospringmvc.repository.UsersRepository;
import com.example.wospringmvc.service.JoinService;
import com.example.wospringmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
 public class UsersController {

    @Autowired
    private JoinService joinService;

    @Autowired
    private LoginService loginService;

    @PostMapping("/joinRequest")
    public String joinRequest(@RequestParam Map<String,String> paramMap){

        String userid = paramMap.get("userid");
        String password = paramMap.get("password");
        String username = paramMap.get("username");

        String page = joinService.joinUser(userid, password, username);


        return page;
    }

    @PostMapping("/loginRequest")
    public String loginRequest(@RequestParam Map<String,String> parseMap){
        String userid = parseMap.get("userid");
        String password = parseMap.get("password");


       String page =  loginService.login(userid,password);

       return page;

    }
}
