package com.example.webdemo.demoweb.dao;

import com.example.webdemo.demoweb.entity.UserVO1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/4 14:23
 * @Version 1.0
 */
@Repository
public interface UserThreadRepository extends JpaRepository<UserVO1, String> {


}
