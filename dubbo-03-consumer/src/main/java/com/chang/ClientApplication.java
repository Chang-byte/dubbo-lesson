package com.chang;

import com.chang.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @title: ClientApplication
 * @Author Chang
 * @Date: 2023-08-25 13:30
 * @Version 1.0
 */
public class ClientApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        boolean b = userService.login("xiaochang", "123456");
        System.out.println(b);
        System.in.read();
        /*
         Qos问题
            13:32:40.160 [main] ERROR org.apache.dubbo.qos.server.Server -
            [DUBBO] qos-server can not bind localhost:22222, dubbo version: 3.2.0, current host: 192.168.183.1, error code: 7-4. This may be caused by , go to https://dubbo.apache.org/faq/7/4 to find instructions.
            java.net.BindException: Address already in use: bind  端口占用错误
         */
    }
}
