package com.nishasoni.orderservice.controller;

import com.nishasoni.orderservice.dto.OrderDto;
import com.nishasoni.orderservice.repository.OrderRepository;
import com.nishasoni.orderservice.service.Impl.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private final OrderServiceImpl orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placedOrder(@RequestBody OrderDto orderDto){
        orderService.placeOrder(orderDto);
        return "Order placed Successfully";
    }
}
