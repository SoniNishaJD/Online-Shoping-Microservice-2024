package com.nishasoni.orderservice.dto;

import java.math.BigDecimal;

public class OrderLineItemDto {

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
