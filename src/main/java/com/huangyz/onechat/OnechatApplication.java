package com.hyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages = "com")
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

