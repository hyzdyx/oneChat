package com.huangyz.onechat.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:31
 * @Version 1.0
 */


@Mapper
public interface UserDao {
    int register(int id, String userName, String password, String date, int sex);

    @Select("select count(*) from User")
    int countUser();
}
