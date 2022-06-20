package com.example.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/web-site")
public class ViewController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
}
