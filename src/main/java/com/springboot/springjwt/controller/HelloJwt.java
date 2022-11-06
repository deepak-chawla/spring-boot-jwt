package com.springboot.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJwt {

    @GetMapping("/hello")
    public String helloFromJwt(){
        return "Hello From Jwt Authentication";
    }
}
