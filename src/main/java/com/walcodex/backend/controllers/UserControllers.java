package com.walcodex.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walcodex.backend.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserControllers {

    private final UserServices userServices;

    public UserControllers(UserServices userServices) {
        this.userServices = userServices;
    }
    
}
