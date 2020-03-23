package com.huangyz.onechat.controller;


import com.huangyz.onechat.entity.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping(value = "/session")
public class SessionTest {
    public ResponseEntity sessiontest(@RequestParam(value = "accout") HttpSession httpSession){
        System.out.println(httpSession.getId());
        System.out.println("111");
        return ResponseEntity.SUCCESS;
    }
}
