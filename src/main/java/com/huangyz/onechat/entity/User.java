package com.huangyz.onechat.entity;


import java.io.Serializable;

/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:10
 * @Version 1.0
 */


public class User implements Serializable {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
