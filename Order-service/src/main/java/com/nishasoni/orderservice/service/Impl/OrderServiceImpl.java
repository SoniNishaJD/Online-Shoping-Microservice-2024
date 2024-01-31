package com.nishasoni.orderservice.service.Impl;

import com.nishasoni.orderservice.dto.OrderDto;
import com.nishasoni.orderservice.dto.OrderLineItemDto;
import com.nishasoni.orderservice.model.Order;
import com.nishasoni.orderservice.model.OrderLineItem;
import com.nishasoni.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl {

    @Autowired
    private final OrderRepository orderRepository;
    public void placeOrder(OrderDto orderDto){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItem> orderLineItem = orderDto.getOrderLineItemDtoList()
        .stream().map(this::mapToDto).toList();

        order.setOrderLineItem(orderLineItem);

        orderRepository.save(order);
    }

    private OrderLineItem mapToDto(OrderLineItemDto orderLineItemDto) {
        OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setPrice(orderLineItem.getPrice());
        orderLineItem.setQuantity(orderLineItem.getQuantity());
        orderLineItem.setSkuCode(orderLineItem.getSkuCode());
        return orderLineItem;
    }
}
