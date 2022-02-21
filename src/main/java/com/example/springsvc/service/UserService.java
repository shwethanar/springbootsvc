package com.example.springsvc.service;


import com.example.springsvc.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse userProfile() {

        UserResponse usrResp = new UserResponse();
        usrResp.setAge(32);
        usrResp.setName("Shwetha Narayan");
        return usrResp;
    }

}
