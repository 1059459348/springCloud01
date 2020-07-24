package com.sj.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring.user")
public interface OrderService {

    @GetMapping("/eureka/user/test")
    String order(@RequestParam("param") String param);
}
