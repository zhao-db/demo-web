package com.example.webdemo.demoweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 16:52
 * @Version 1.0
 */
@Configuration
public class WebMVCConfiguration implements WebMvcConfigurer {
/*
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private WebInterceptor webInterceptor;*/

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(webInterceptor).addPathPatterns("/**").excludePathPatterns("/**/*.do", "/test/**");
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/demo/**", "/test/**");
//    }
}
