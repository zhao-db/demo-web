/*
package com.example.webdemo.demoweb.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

*/
/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/4 13:52
 * @Version 1.0
 *//*

@Component
public class RabbitmqProducer {

    private static final String ZDB_QUEUE = "zdb-test";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMsg(String jsonObject) {
        rabbitTemplate.convertAndSend(ZDB_QUEUE, jsonObject);
    }


}
*/
