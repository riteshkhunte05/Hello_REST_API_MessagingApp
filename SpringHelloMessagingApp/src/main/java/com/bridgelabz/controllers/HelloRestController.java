package com.bridgelabz.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    // UC1 : Create a Rest Controller to demonstrate
    //       the various HTTP Methods and respond
    //       hello messages to the User.
    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello From BridgeLabz ";
    }

    // UC2 : Use GET Request Method and pass name
    //       as query parameter.
    // By Using @RequestMapping
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!!!";
    }

    // By Using @GetMapping
    @GetMapping({"/query1"})
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!!!";
    }
}
