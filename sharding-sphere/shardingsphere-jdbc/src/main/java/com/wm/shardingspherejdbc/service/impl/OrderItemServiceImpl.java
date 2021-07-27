package com.wm.shardingspherejdbc.service.impl;

import com.wm.shardingspherejdbc.mapper.OrderItemMapper;
import com.wm.shardingspherejdbc.model.OrderItem;
import com.wm.shardingspherejdbc.service.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wangm
 * @date: 2021/7/27 16:13
 * @Description
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

    public OrderItemMapper orderItemMapper;

    public OrderItemServiceImpl(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Override
    public int insert(OrderItem orderItem) {
        return orderItemMapper.insert(orderItem);
    }

    @Override
    public List<OrderItem> listOrderItem() {
        return orderItemMapper.listOrderItem();
    }
}
