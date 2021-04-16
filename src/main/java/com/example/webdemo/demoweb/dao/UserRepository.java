package com.example.webdemo.demoweb.dao;

import com.example.webdemo.demoweb.entity.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/4 14:23
 * @Version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<UserVO, String> {


}
