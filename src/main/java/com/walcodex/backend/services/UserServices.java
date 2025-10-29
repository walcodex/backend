package com.walcodex.backend.services;

import org.springframework.stereotype.Service;

import com.walcodex.backend.repositories.UserRepository;

@Service
public class UserServices {
    
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
}
