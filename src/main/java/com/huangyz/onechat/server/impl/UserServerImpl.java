package com.huangyz.onechat.server.impl;

import com.huangyz.onechat.dao.UserDao;
import com.huangyz.onechat.server.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:23
 * @Version 1.0
 */
@Service
public class UserServerImpl implements IUserServer {

    @Autowired
    private UserDao userDao;

    @Override
    public int register(String userName, String password, String date,int sex) {
        int id = 100000 + count();
        return userDao.register(id,userName,password,date,sex);
    }

    @Override
    public int count() {
        return userDao.countUser();
    }

}
