package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task4 {
    private String name = "Ali";
    private int age = 21;

    @GetMapping("/student")
    public String getStudent() {
        return "Student: " + name + ", Age: " + age;
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        if (age >= 18) {
            return "Age " + age + ": You are an adult.";
        } else {
            return "Age " + age + ": You are not an adult.";
        }
    }

    @GetMapping("/update-student/{age}")
    public String setAge(@PathVariable int age) {
        this.age = age;
        return "Student age updated to: " + age;
    }

    private String teacherName = "John Smith";
    private String subject = "Computer Science";

    @GetMapping("/teacher")
    public String getTeacher() {
        return "Teacher: " + teacherName + ", Subject: " + subject;
    }

    private String courseTitle = "Web Development";
    private int duration = 12; // weeks

    @GetMapping("/course")
    public String getCourse() {
        return "Course: " + courseTitle + ", Duration: " + duration + " weeks";
    }

    private String bookTitle = "Spring Boot in Action";
    private String author = "Craig Walls";
    private double price = 39.99;

    @GetMapping("/book")
    public String getBook() {
        return "Book: " + bookTitle + ", Author: " + author + ", Price: $" + price;
    }
}