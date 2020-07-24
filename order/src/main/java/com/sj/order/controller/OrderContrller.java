package com.sj.order.controller;

import com.sj.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eureka/order")
public class OrderContrller {
    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public ResponseEntity<String> orderTest(@RequestParam String param) {
        System.out.println("Order前往调用User");
        return restTemplate.getForEntity("localhost:8001/eureka/user/test?param="+param, String.class);
        //  return orderService.order(param);
    }
}
