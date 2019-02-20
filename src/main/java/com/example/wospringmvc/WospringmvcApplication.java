package com.example.wospringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableJpaRepositories
public class WospringmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(WospringmvcApplication.class, args);
    }

}
