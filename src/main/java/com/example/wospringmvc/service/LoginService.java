package com.example.wospringmvc.service;


import com.example.wospringmvc.model.Users;
import com.example.wospringmvc.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    @Autowired
    private UserPasswordHashClass userPasswordHashClass;

    @Autowired
    private UsersRepository usersRepository;

    public String login(String userId,String userPw){
        if(userId.equals("") || userPw.equals("") ){
            return "login";
        }

       String hashedPassword= userPasswordHashClass.getSHA256(userPw);

       Users users = usersRepository.findByUsers_idAndAndUsers_pw(userId,hashedPassword);
       if(users==null){
           return "login";
       }

        return "index";
    }
}
