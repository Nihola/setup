package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task3 {
    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference of " + x + " and " + y + " is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Cannot divide by zero.";
        }
        return "The division of " + x + " by " + y + " is " + ((double) x / y) + ".";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Cannot calculate modulus with zero divisor.";
        }
        return "The remainder when " + x + " is divided by " + y + " is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable double base, @PathVariable double exp) {
        double result = Math.pow(base, exp);
        return base + " raised to the power of " + exp + " is " + result + ".";
    }
}
