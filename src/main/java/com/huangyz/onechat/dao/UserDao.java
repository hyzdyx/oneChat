package com.huangyz.onechat.dao;


import com.huangyz.onechat.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:31
 * @Version 1.0
 */


public interface UserDao {
    List<User> findPerson();
}
