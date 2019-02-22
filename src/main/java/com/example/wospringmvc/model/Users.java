package com.example.wospringmvc.model;


import lombok.*;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.Objects;


@Table(name = "users")
@Data
@Entity

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userid;
    private String password;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
