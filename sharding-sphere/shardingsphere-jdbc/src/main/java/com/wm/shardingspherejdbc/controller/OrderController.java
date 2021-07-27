package com.wm.shardingspherejdbc.controller;

import com.wm.shardingspherejdbc.model.Order;
import com.wm.shardingspherejdbc.model.OrderItem;
import com.wm.shardingspherejdbc.model.OrderVo;
import com.wm.shardingspherejdbc.service.OrderItemService;
import com.wm.shardingspherejdbc.service.OrderService;
import com.wm.shardingspherejdbc.util.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: wangm
 * @date: 2021/7/27 16:03
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    public OrderService orderService;

    public OrderItemService orderItemService;

    public OrderController(OrderService orderService, OrderItemService orderItemService) {
        this.orderService = orderService;
        this.orderItemService = orderItemService;
    }

    @PostMapping(value = "/createOrder", produces = { "application/json;charset=UTF-8" })
    public OrderItem createOrder(@RequestBody OrderVo orderVo){
        Long orderId = IdWorker.getLongId();
        Order order = new Order();
        order.setOrderId(orderId);
        order.setCreateTime(new Date());
        order.setMemberId(orderVo.getMemberId().toString());
        order.setOrderAmount(orderVo.getItemAccount());
        order.setStatus("1");

        orderService.createOrder(order);
        log.info("创建订单成功，订单号={}", orderId);

        OrderItem orderItem = new OrderItem();
        orderItem.setCreateTime(new Date());
        orderItem.setItemAccount(orderVo.getItemAccount());
        orderItem.setItemId(IdWorker.getLongId());
        orderItem.setOrderId(orderId.toString());
        orderItem.setProductName(orderVo.getProductName());
        orderItemService.insert(orderItem);
        return orderItem;
    }
}
