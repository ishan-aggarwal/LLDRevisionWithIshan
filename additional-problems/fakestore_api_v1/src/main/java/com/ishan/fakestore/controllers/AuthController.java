package com.ishan.fakestore.controllers;

import com.ishan.fakestore.models.LoginRequest;
import com.ishan.fakestore.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // add authentication logic
        return authService.login(loginRequest.getUsername(), loginRequest.getPassword());
    }
}