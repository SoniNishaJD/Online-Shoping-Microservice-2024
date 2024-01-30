package com.nishasoni.orderservice.controller;

import com.nishasoni.orderservice.dto.OrderDto;
import com.nishasoni.orderservice.repository.OrderRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placedOrder(@RequestBody OrderDto orderDto){
        return "Order placed Successfully";
    }
}
