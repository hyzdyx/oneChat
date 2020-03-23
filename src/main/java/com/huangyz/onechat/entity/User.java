package com.hyz.entity;



/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:10
 * @Version 1.0
 */


public class User {
    private String userName;
    //1代表男，2代表女

    private int sex;

    private String password;

    private String birthday;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



}
