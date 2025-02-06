package com.javacodes.springbootdemo.firstSpringApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    // expose a "/" endpoint that return "Hello world"

    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }

}
