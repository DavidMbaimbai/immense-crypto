package com.immense.crypto.app.service;


import com.immense.crypto.app.domain.OrderType;
import com.immense.crypto.app.model.Coin;
import com.immense.crypto.app.model.Order;
import com.immense.crypto.app.model.OrderItem;
import com.immense.crypto.app.model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
