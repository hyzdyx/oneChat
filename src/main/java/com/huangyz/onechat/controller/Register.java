package com.huangyz.onechat.controller;

import com.huangyz.onechat.entity.ResponseEntity;
import com.huangyz.onechat.server.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:06
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/register")
public class Register {
    @Autowired
    private IUserServer iUserServer;

    public ResponseEntity register(@RequestParam(value = "userName") String userName,
                                   @RequestParam(value = "password") String password,
                                   @RequestParam(value = "birthday") String date,
                                   @RequestParam(value = "sex") int sex) {

        return ResponseEntity.SUCCESS;
    }
}
