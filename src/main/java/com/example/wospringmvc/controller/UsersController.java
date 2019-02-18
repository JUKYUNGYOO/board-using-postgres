package com.example.wospringmvc.controller;


import com.example.wospringmvc.repository.UsersRepository;
import com.example.wospringmvc.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping(value = "/joinRequest")
    public String joinRequest(HttpServletRequest request){
        JoinService joinService = new JoinService();
        joinService.joinUser(request, usersRepository);

            return "index";
    }

    @PostMapping(value = "/loginRequest")
    public String loginRequest(){
        return "index";

    }
}
