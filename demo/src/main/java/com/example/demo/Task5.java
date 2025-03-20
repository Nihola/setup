package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task5 {
    @GetMapping("/greet")
    public String greet(
            @RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam(name = "x", defaultValue = "0") double x,
            @RequestParam(name = "y", defaultValue = "0") double y,
            @RequestParam(name = "operation", defaultValue = "add") String operation) {

        double result = 0;
        String operationName = "";

        switch(operation.toLowerCase()) {
            case "add":
                result = x + y;
                operationName = "addition";
                break;
            case "subtract":
                result = x - y;
                operationName = "subtraction";
                break;
            case "multiply":
                result = x * y;
                operationName = "multiplication";
                break;
            case "divide":
                if (y == 0) {
                    return "Cannot divide by zero.";
                }
                result = x / y;
                operationName = "division";
                break;
            default:
                return "Invalid operation. Supported operations: add, subtract, multiply, divide.";
        }

        return "The result of " + operationName + " of " + x + " and " + y + " is " + result + ".";
    }

    @GetMapping("/filter")
    public String filter(
            @RequestParam(name = "keyword", defaultValue = "") String keyword,
            @RequestParam(name = "category", defaultValue = "all") String category) {

        return "Filtered results for keyword '" + keyword + "' in category '" + category + "'.";
    }

    @GetMapping("/convert")
    public String convert(
            @RequestParam(name = "temperature", defaultValue = "0") double temperature) {

        double fahrenheit = (temperature * 9/5) + 32;
        return temperature + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.";
    }

    @GetMapping("/discount")
    public String discount(
            @RequestParam(name = "originalPrice", defaultValue = "0") double originalPrice,
            @RequestParam(name = "discountRate", defaultValue = "0") double discountRate) {

        if (discountRate < 0 || discountRate > 100) {
            return "Discount rate must be between 0 and 100.";
        }

        double discountAmount = originalPrice * (discountRate / 100);
        double discountedPrice = originalPrice - discountAmount;

        return "Original price: $" + originalPrice +
                ", Discount rate: " + discountRate + "%" +
                ", Discount amount: $" + discountAmount +
                ", Final price: $" + discountedPrice;
    }
}