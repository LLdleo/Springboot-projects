package com.lin.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class test {
    @RequestMapping("")
    public String urlTest1(){
        return "Hello World!";
    }
    @RequestMapping("test")
    public String urlTest2(){
        return "test";
    }
}
