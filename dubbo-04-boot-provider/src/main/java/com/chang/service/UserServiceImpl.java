package com.chang.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @title: UserServiceImpl
 * @Author Chang
 * @Date: 2023-08-25 15:25
 * @Version 1.0
 */
@DubboService
public class UserServiceImpl implements UserService {
    /*
        [Dubbo] Current Spring Boot Application is await...
        代表provider服务发布成功
     */
    @Override
    public boolean login(String name, String password) {
        System.out.println("name:" + name + ",password:" + password);
        return false;
    }
}
