package com.example.authassignment.controller;

import com.example.authassignment.service.AuthService;

public class AuthController {
    private AuthService authService;
    public String login(String userName,String password){
        String token = this.authService.login(userName,password);
        return token;
    }
    public boolean validate(String userName){
        return this.authService.validate(userName);

    }
}
