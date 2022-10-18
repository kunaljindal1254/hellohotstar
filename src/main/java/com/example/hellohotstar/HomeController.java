package com.example.hellohotstar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String sayHello(){

        return "Hello Hotstar!";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable("name") String name){

        return "Hello " + name + ". Welcome to hotstar";
    }
}
