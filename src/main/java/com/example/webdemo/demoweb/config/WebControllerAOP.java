package com.example.webdemo.demoweb.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 17:01
 * @Version 1.0
 */
@Aspect
@Component
@Slf4j
public class WebControllerAOP {

   /* @Pointcut("execution(public * com.example.webdemo.demoweb.controller.*.*(..))")
    public void optLog() {
    }

    @Before("optLog()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("aop 前置通知开始==>>");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        log.info("aop 请求参数名为{}", methodSignature.getParameterNames());
        log.info("aop 请求参数值为{}", Arrays.toString(joinPoint.getArgs()));
        log.info("aop 请求方法为{}", signature.getName());
        log.info("aop 代理类Name为{}", signature.getDeclaringTypeName());
        log.info("aop 请求URL为{}", request.getRequestURI());
        log.info("aop 请求IP为{}", request.getRequestURL());
        log.info("aop 请求User为{}", request.getRemoteUser());
        log.info("aop 请求User为{}", request.getMethod());

    }*/

}
