package com.immense.crypto.app.request;


import com.immense.crypto.app.domain.OrderType;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
