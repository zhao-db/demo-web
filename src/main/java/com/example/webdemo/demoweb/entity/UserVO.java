package com.example.webdemo.demoweb.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 18:15
 * @Version 1.0
 */
@Data
@Entity
@Table(name = "user")
public class UserVO {

    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "nick_name")
    private String nickName;
    @Id
    @Column(name = "id")
    private String id;

}
