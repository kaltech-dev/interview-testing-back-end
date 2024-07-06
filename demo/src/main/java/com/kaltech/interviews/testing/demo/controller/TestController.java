package com.kaltech.interviews.testing.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<?>  testMethod() {
        System.out.println("Test Method");
        return new ResponseEntity<>("Test Method - hello world", HttpStatus.OK);
    }
}
