package com.wm.shardingspherejdbc.mapper;

import com.wm.shardingspherejdbc.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: wangm
 * @date: 2021/7/26 17:20
 * @Description
 */
@Mapper
public interface OrderItemMapper {

    int insert(OrderItem orderItem);

    int deleteById(Long itemId);

    List<OrderItem> listOrderItem();
}
