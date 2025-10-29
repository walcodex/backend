package com.walcodex.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walcodex.backend.entity.USER;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping()
public class TestController {

    @GetMapping
    public String app () {
        return "Backend Application";
    }
    
    @GetMapping("/hello")
    public USER hello() {
        return new USER("ravinder", 21);
    }

    @GetMapping("/public/greet")
    public String greet() {
        return "Hello, welcome to the public endpoint!";
    }
    
}
