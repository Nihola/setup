package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task2 {
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("/length/{text}")
    public String getLength(@PathVariable String text) {
        return "The length of '" + text + "' is " + text.length() + ".";
    }

    @GetMapping("/reverse/{text}")
    public String reverseText(@PathVariable String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return "The reversed string of '" + text + "' is '" + reversed + "'.";
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concatenateStrings(@PathVariable String str1, @PathVariable String str2) {
        return "The concatenation of '" + str1 + "' and '" + str2 + "' is '" + str1 + str2 + "'.";
    }
}