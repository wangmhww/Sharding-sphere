package com.wm.shardingspherejdbc.service;

import com.wm.shardingspherejdbc.model.Member;

/**
 * @author: wangm
 * @date: 2021/7/23 14:35
 * @Description
 */
public interface IMemberService {
    int insert(Member record);

    Member getMemberByPrimaryKey(Long memberId);

    int deleteByPrimaryKey(Long memberId);
}
