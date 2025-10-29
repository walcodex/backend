package com.walcodex.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping()
public class TestController {

    @GetMapping
    public String app () {
        return "Backend Application";
    }
    

    @GetMapping("/public")
    public String greet() {
        return "This is the public endpoint!";
    }

}
