package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task1 {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2>"
                + "<ul>"
                + "<li>Web Development</li>"
                + "<li>Mobile App Development</li>"
                + "<li>SEO Optimization</li>"
                + "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a web application built using Spring Boot.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>"
                + "<ul>"
                + "<li>What services do you offer?</li>"
                + "<li>How can I contact support?</li>"
                + "</ul>";
    }

    @GetMapping("/contact-us")
    public String contact() {
        return "<h2>Contact Us</h2>"
                + "<p>Email: support@example.com</p>"
                + "<p>Phone: +1234567890</p>";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Our Team</h2>"
                + "<p>John Doe - CEO</p>"
                + "<p>Jane Smith - Developer</p>";
    }
}
