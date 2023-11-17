package com.example.authassignment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SessionModel extends BaseModel{
    String token;
    UserModel userModel;
}
