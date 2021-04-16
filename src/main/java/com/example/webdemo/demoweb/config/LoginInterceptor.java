/*
package com.example.webdemo.demoweb.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.webdemo.demoweb.entity.UserVO;
import com.example.webdemo.demoweb.util.RedisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;

*/
/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 18:57
 * @Version 1.0
 *//*

@Component
@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

   */
/* @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        boolean flag = Boolean.FALSE;
        if (token != null && !"".equals(token)) {
            Object obj = redisUtil.get(token);
            UserVO userVo = JSON.parseObject(obj.toString(), UserVO.class);
            if (obj != null) {
                flag = true;
            } else {
                log.info("用户不存在，请重新登录");
                response.setCharacterEncoding(StandardCharsets.UTF_8.name());
                response.getOutputStream().write(new ObjectMapper().writeValueAsBytes("用户不存在，请重新登录"));
                response.getOutputStream().close();
                flag = false;
            }
        } else {
            log.info("token不能为空，请重新登录");
            response.setCharacterEncoding(StandardCharsets.UTF_8.name());
            JSONObject json = JSON.parseObject("{\"msg\":\"token不能为空，请重新登录\"}");
            response.getOutputStream().write(new ObjectMapper().writeValueAsBytes(json));
            response.getOutputStream().close();
            flag = false;
        }
        return flag;
    }*//*

}
*/
