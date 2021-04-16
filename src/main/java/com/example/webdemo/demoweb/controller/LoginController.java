package com.example.webdemo.demoweb.controller;

import com.example.webdemo.demoweb.entity.UserVO;
import com.example.webdemo.demoweb.service.LoginService;
import com.example.webdemo.demoweb.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 18:14
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class LoginController {

    @Autowired
    private LoginService loginService;
/*
    @RequestMapping("/registered")
    public String registered(@RequestBody UserVO userVO) {
        return loginService.register(userVO);
    }*/

}
