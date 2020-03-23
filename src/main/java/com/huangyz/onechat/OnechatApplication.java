package com.huangyz.onechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages = "com.huangyz.onechat")
@Cacheable
public class OnechatApplication {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(OnechatApplication.class, args);
    }

}

