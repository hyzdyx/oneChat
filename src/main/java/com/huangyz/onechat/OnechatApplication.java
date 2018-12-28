package com.huangyz.onechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;

@SpringBootApplication
@Cacheable
public class OnechatApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnechatApplication.class, args);
    }

}

