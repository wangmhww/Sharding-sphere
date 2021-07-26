package com.wm.shardingspherejdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: wangm
 * @date: 2021/7/23 15:53
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long orderId;

    private String memberId;

    private String orderCode;

    private Double orderAmount;

    private String status;

    private Date createTime;
}
