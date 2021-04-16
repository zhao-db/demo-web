package com.example.webdemo.demoweb.controller;

import com.example.webdemo.demoweb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApolloController {
    /*
        @Value("${test.demo.username}")
        private String username;*/
/*
    @RequestMapping("/say")
    public String sayHelloByName() {
        return "Hello world ：" + username + "!";
    }*/

    @Autowired
    private LoginService service;

    @RequestMapping("/say.do")
    public String sayHelloByDo(String username) {
        return "Hello world ：" + username + "!";
    }

    @RequestMapping("/say/xx.do")
    public String sayHelloByXXDo(String username) {
        return "Hello world ：" + username + "!";
    }

    @RequestMapping("/thread")
    public String thread(String username) {
        return service.threadInsert();
    }


}
