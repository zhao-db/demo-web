package com.example.webdemo.demoweb.controller;

import com.alibaba.fastjson.JSON;
import com.example.webdemo.demoweb.entity.UserVO;
import com.example.webdemo.demoweb.service.LoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 19:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserCongtroller {


    @Autowired
    private LoginService loginService;

/*
    @RequestMapping("/userList")
    public Object findAllUsers() {
        Object obj = loginService.findAllUsers();
        return obj;
    }
*/

}
