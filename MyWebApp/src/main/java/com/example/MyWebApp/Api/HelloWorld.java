package com.example.MyWebApp.Api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world"+new Date();
    }
}
