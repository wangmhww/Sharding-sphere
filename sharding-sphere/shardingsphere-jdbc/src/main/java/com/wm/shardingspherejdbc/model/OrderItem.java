package com.wm.shardingspherejdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: wangm
 * @date: 2021/7/23 15:57
 * @Description
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private Long itemId;

    private String orderId;

    private String productName;

    private String itemAccount;

    private Date createTime;
}
