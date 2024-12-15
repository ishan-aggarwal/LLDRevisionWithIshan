package com.ishan.registeruser.services;

import com.ishan.registeruser.models.User;

public interface UserService {

    public User signupUser(String name, String email, String password) throws Exception;

    public boolean login(String email, String password) throws Exception;
}
