package com.nullpointerexception.resapl.controller;

import com.nullpointerexception.resapl.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("/")
    public String hello(){
        return helloService.hello();
    }
}
