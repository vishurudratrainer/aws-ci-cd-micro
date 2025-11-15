package com.training.aws_spring_ci_cd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String up(){
        return "App is up and running";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to AWS CI/CD";
    }

}
