package com.example.authassignment.service;

public class AuthServiceImpl implements AuthService{
    @Override
    public String login(String email, String password) {

        return email;
    }

    @Override
    public boolean validate(String userName) {

        return false;
    }
}
