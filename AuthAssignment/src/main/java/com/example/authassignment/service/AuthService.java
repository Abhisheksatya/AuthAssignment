package com.example.authassignment.service;

public interface AuthService {
    public String login(String email, String password);
    public boolean validate(String userName);
}
