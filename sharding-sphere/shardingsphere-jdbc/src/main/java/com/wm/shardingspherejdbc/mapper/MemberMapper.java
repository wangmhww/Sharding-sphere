package com.wm.shardingspherejdbc.mapper;

import com.wm.shardingspherejdbc.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: wangm
 * @date: 2021/7/23 14:43
 * @Description
 */
@Mapper
public interface MemberMapper {
    /**
     * 根据主键删除会员信息
     * @param memberId 会员id
     * @return 执行结果影响行数
     */
    int deleteByPrimaryKey(@Param("memberId") Long memberId);

    /**
     * 插入会员信息
     * @param record 会员记录
     * @return 插入行数
     */
    int insert(Member record);

    /**
     * 根据主键查询会员信息
     * @param memberId 会员id
     * @return 会员信息
     */
    Member getMemberByPrimaryKey(Long memberId);

}
