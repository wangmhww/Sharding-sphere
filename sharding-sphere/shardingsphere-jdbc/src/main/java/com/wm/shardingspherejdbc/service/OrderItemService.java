package com.wm.shardingspherejdbc.service;

import com.wm.shardingspherejdbc.model.OrderItem;

import java.util.List;

/**
 * @author: wangm
 * @date: 2021/7/27 16:09
 * @Description
 */
public interface OrderItemService {
    int insert(OrderItem orderItem);

    List<OrderItem> listOrderItem();
}
