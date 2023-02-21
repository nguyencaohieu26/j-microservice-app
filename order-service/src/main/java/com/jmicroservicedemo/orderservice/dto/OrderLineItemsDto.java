package com.jmicroservicedemo.orderservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
