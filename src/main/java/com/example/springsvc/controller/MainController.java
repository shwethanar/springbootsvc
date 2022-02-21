package com.example.springsvc.controller;

import com.example.springsvc.response.UserResponse;
import com.example.springsvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class MainController {

    @Autowired
    UserService userSvc;

    @GetMapping(value = "/profile")
    public UserResponse getUser(){
       return userSvc.userProfile();
    }
}
