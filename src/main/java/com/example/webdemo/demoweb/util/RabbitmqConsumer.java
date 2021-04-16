/*
package com.example.webdemo.demoweb.util;

import com.alibaba.fastjson.JSONObject;
import com.example.webdemo.demoweb.dao.UserRepository;
import com.example.webdemo.demoweb.entity.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

*/
/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/4 14:39
 * @Version 1.0
 *//*

@Component
@Slf4j
public class RabbitmqConsumer {

    private static final String ZDB_QUEUE = "zdb-test";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private UserRepository userRepository;

    @RabbitListener(queues = ZDB_QUEUE)
    public void receiveMsg(org.springframework.amqp.core.Message message) throws UnsupportedEncodingException {
        log.info("==>>收到消息，开始消费,msg{}", message.getBody());
        String msg = new String(message.getBody(), "UTF-8");
        log.info("==>>收到消息，开始消费,msg{}", msg);
        UserVO userVO = JSONObject.parseObject(msg, UserVO.class);
        userRepository.save(userVO);
        log.info("消费完成");
    }

}
*/
