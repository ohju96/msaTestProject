package com.example.reviewservie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/review")
public class review {

    @RequestMapping("/")
    public String getUser() {
        return "review Information";
    }
}
