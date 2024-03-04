package com.swami.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoints {

    @GetMapping("/")
    public String welcome() { 
        return "Welcome!!!!"; 
    } 

}