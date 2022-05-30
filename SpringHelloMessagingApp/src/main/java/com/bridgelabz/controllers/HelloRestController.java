package com.bridgelabz.controllers;

import com.bridgelabz.Model.User;
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


    // UC3 : Use GET Request Method and pass name as
    //       path variable.
    //
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz!!!";
    }

    // UC4 : Use POST Request Method and pass first name and
    //       last name in the Body.

    @PostMapping (value = {"/create-user","/post"})
    public String sayHello(@RequestBody User user){
        return "Hello "+user.getFirstName() + " " +user.getLastName() + "from BridgeLabz!!! ";
    }

    // UC5 : Use PUT Request Method and pass first name as
    //       Path Variable and last name as Query Parameter.
    @PutMapping("/update/{firstName}")
    public String sayHellotaylor (@PathVariable String firstName,@RequestParam String lastName,User user){
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return "Hello "+user.getFirstName() + " " +user.getLastName() +"from BridgeLabz!!!";
    }
    
}

