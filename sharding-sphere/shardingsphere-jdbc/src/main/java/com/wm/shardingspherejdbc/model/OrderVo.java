package com.wm.shardingspherejdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wangm
 * @date: 2021/7/27 16:16
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVo {
    private Long memberId;

    private String productName;

    private Double itemAccount;
}
