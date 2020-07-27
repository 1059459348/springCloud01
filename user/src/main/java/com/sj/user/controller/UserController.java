package com.sj.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eureka/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public String test(@RequestParam(defaultValue = "AAA") String param) {
        System.out.println("调用成功"+param);
        return "Hello" + param;
    }
}
