package com.example.newsservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class news {

    @RequestMapping("/")
    public String getUser() {
        return "news Information";
    }
}
