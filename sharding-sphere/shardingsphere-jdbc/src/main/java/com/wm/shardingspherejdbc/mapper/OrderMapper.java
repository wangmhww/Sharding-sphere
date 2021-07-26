package com.wm.shardingspherejdbc.mapper;

import com.wm.shardingspherejdbc.model.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: wangm
 * @date: 2021/7/23 15:52
 * @Description
 */
@Mapper
public interface OrderMapper {

    /**
     * 新增等订单信息
     * @param record
     * @return
     */
    int insert(Order record);
}
