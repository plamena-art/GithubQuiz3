package com.goanna.controller;

import com.goanna.entity.MyName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



public class MyNameController {
    private static final String template = "Hello, %s!";


    @GetMapping("/greeting")
    public MyName myName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new MyName(String.format(template, name));
    }
}