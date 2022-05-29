package com.bridgelabz.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello From BridgeLabz!!! ";
    }
}