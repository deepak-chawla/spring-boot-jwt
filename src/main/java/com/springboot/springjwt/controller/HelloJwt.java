package com.springboot.springjwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloJwt {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String helloAdminFromJwt(){
        return "Hello ADMIN From Jwt Authentication";
    }

    @GetMapping("/hello-user")
    @PreAuthorize("hasAuthority('USER')")
    public String helloUserFromJwt(){
        return "Hello USER From Jwt Authentication";
    }
}
