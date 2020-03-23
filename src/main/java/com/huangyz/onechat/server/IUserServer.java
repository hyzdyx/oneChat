package com.hyz.server;

/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:22
 * @Version 1.0
 */

public interface IUserServer {
    int register(String userName, String password, String date, int sex);
    int count();
}
