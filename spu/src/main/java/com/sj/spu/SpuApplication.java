package com.sj.spu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient   //声明是一个客户端  注册到注册中心
@EnableFeignClients
public class SpuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpuApplication.class, args);
    }

}
