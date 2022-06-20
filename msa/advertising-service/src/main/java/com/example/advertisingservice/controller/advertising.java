package com.example.advertisingservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advertising")
public class advertising {

    @RequestMapping("/")
    public String getUser() {
        return "advertising Information";
    }
}
