package com.example.wospringmvc.service;

import com.example.wospringmvc.model.Users;
import com.example.wospringmvc.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


@Service
public class JoinService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UserPasswordHashClass userPasswordHashClass;

    public String joinUser(String userId,String userPw,String userName){
        if(userId.equals("") || userPw.equals("") || userName.equals("")){
            return "join";
        }

        Users users = new Users();
        users.setUserid(userId);
       String hashedPassword = userPasswordHashClass.getSHA256(userPw);


        users.setPassword(hashedPassword);
        users.setUsername( userName);

        usersRepository.save(users);
        return "index";


    }
}
