package com.ishan.registeruser.dtos;


import lombok.Data;

@Data
public class SignupUserRequestDTO {
    private String name;
    private String email;
    private String password;
}
