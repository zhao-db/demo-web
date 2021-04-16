package com.example.webdemo.demoweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

/*    @ApolloConfigChangeListener
    public void someChangeHandler(ConfigChangeEvent configChangeEvent) {
        for (String key : configChangeEvent.changedKeys()) {
            ConfigChange change = configChangeEvent.getChange(key);
            log.info("修改配置->{}", change);

        }
    }*/

}
