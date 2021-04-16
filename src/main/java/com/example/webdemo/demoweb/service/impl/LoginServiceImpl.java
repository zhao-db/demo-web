package com.example.webdemo.demoweb.service.impl;

import com.example.webdemo.demoweb.dao.UserRepository;
import com.example.webdemo.demoweb.dao.UserThreadRepository;
import com.example.webdemo.demoweb.entity.UserVO;
import com.example.webdemo.demoweb.entity.UserVO1;
import com.example.webdemo.demoweb.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/9/3 18:18
 * @Version 1.0
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

/*
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RabbitmqProducer rabbitmqProducer;
*/


    @Autowired
    UserRepository userRepository;
    @Autowired
    UserThreadRepository threadRepository;

    private List<UserVO> getInsertList() {
        List<UserVO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            UserVO v1 = new UserVO();
            v1.setId(i + 1 + "");
            v1.setAge(random.nextInt());
            list.add(v1);
        }
        return list;
    }

    @Override
    public String threadInsert() {
//        List<UserVO> insertList = this.getInsertList();
        List<UserVO> insertList = userRepository.findAll();
        List<UserVO1> l1 = new ArrayList<>();

        for (UserVO vo : insertList) {
            UserVO1 vo1 = new UserVO1();
            BeanUtils.copyProperties(vo, vo1);
            l1.add(vo1);
        }
        int j = insertList.size() / 2;
        ExecutorService executor = new ThreadPoolExecutor(2, 2, 1000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 0; i <= j; i++) {
            executor.submit(new Thread(new Runnable() {
                @Override
                public void run() {
                    threadRepository.saveAll(l1);
                    latch.countDown();
                }
            }));
        }
        try {
            latch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*

     *//**
     * 用户注册
     *
     * @param userVO
     * @return
     *//*
    @Override
    public String register(UserVO userVO) {
        log.info("请求参数{}", userVO.toString());
        String userName = userVO.getUserName();
        String password = userVO.getPassword();
        byte[] token = (userName + password).getBytes();
        String id = Base64.getEncoder().encodeToString(token);
        userVO.setId(id);
        redisUtil.set(id, JSON.toJSONString(userVO));
        rabbitmqProducer.sendMsg(JSONObject.toJSONString(userVO));
        return "success";
    }

    *//**
     * 获取所有用户信息
     *
     * @return
     *//*
    @Override
    public Object findAllUsers() {
        if (redisUtil.get("all_user") == null) {
            List<UserVO> list = userRepository.findAll();
            redisUtil.set("all_user", list);
            return list;
        } else {
            Object obj = redisUtil.get("all_user");
            return obj;
        }
    }*/
}
