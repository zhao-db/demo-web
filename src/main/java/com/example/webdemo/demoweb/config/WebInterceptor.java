package com.example.webdemo.demoweb.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 16:40
 * @Version 1.0
 */
@Slf4j
@Component
public class WebInterceptor extends HandlerInterceptorAdapter {
/*
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("请求地址为{}", request.getRequestURI());
        log.info("请求方法为{}", request.getMethod());
        log.info("请求客户端地址{}", request.getContextPath());
        log.info("请求session{}", request.getRequestedSessionId());
        log.info("请求客户端地址{}", request.getServletPath());
        log.info("请求参数为{}", request.getParameterMap().toString());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("方法调用完成");

    }*/
}
