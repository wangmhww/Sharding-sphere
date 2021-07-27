package com.wm.shardingspherejdbc.service.impl;

import com.wm.shardingspherejdbc.mapper.OrderMapper;
import com.wm.shardingspherejdbc.model.Order;
import com.wm.shardingspherejdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wangm
 * @date: 2021/7/27 16:06
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {
    
    OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public int createOrder(Order order) {

        return orderMapper.insert(order);
    }

    @Override
    public List<Order> listOrderInfos() {
        return null;
    }
}
