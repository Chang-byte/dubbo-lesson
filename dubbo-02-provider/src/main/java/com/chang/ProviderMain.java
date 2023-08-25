package com.chang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @title: ProviderMain
 * @Author Chang
 * @Date: 2023-08-25 10:46
 * @Version 1.0
 */
public class ProviderMain {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        ctx.start();

        // 阻塞在程序中
        new CountDownLatch(1).await();
//        System.in.read();

        /*
        org.apache.dubbo.config.deploy.DefaultApplicationDeployer -
        [DUBBO] Dubbo Application[1.1](dubbo-02-provider) is ready.,
        dubbo version: 3.2.0, current host: 192.168.183.1
        代表Provider 已经成功配置


        Export dubbo service com.chang.service.UserService to url dubbo://192.168.183.1:20880
        成功导出服务
         */
    }
}
