package com.sj.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka/user")
public class UserController {

    @GetMapping("/test")
    public String test(@RequestParam(defaultValue = "AAA") String param) {
        System.out.println(param+"调用成功"+param);
        return "Hello" + param;
    }
}
