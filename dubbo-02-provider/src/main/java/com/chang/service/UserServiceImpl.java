package com.chang.service;

/**
 * @title: UserServiceImpl
 * @Author Chang
 * @Date: 2023-08-25 10:36
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    /**
     * 实现具体的接口
     * 两个虚拟机通过网络进行通信
     * @param name
     * @param password
     * @return
     */
    @Override
    public boolean login(String name, String password) {
        // 服务端(提供方)进行打印输出
        System.out.println("UserServiceImpl login: " + name + "、 " + password);
        return false;
    }
}
