package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ProfileController {
    @RestController
    @RequestMapping("/profile")
    public class profileController {

        @Value("${app.message}")
        private String message;

        @GetMapping
        public String getMessage() {
            return message;
        }
    }
}
