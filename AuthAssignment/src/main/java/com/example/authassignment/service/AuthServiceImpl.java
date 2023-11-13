package com.example.authassignment.service;


import java.nio.charset.Charset;
import java.util.Random;

public class AuthServiceImpl implements AuthService{
    @Override
    public String login(String email, String password) {
        byte[] byteArray = new byte[20];
        Random random = new Random();
        random.nextBytes(byteArray);

        return new String(byteArray, Charset.forName("UTF-8"));

    }

    @Override
    public boolean validate(String userName) {

        return false;
    }
}
