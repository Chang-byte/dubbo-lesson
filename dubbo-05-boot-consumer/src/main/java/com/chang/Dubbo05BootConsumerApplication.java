package com.chang;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Dubbo05BootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo05BootConsumerApplication.class, args);
    }

}
