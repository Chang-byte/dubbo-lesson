package com.chang;

import com.chang.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Dubbo05BootConsumerApplicationTests {

    @DubboReference(url = "dubbo://192.168.183.1:20880/com.chang.service.UserService")
    UserService userService;

    @Test
    public void test(){
        boolean ret = userService.login("xiaochang", "12341234");
        System.out.println("ret = " + ret);
    }

    @Test
    void contextLoads() {
    }

}
