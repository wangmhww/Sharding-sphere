package com.wm.shardingspherejdbc.service;

import com.wm.shardingspherejdbc.model.Order;

import java.util.List;

/**
 * @author: wangm
 * @date: 2021/7/27 16:04
 * @Description
 */
public interface OrderService {

    int createOrder(Order order);

    List<Order> listOrderInfos();

}
