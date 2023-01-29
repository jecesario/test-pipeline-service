package com.example.testpipelineservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController {

    @GetMapping
    public String test() {

        if(10 > 11) {
            throw new IllegalArgumentException("Sample message");
        }

        return "Test OK!";

    }
}
