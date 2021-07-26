package com.wm.shardingspherejdbc.service.impl;

import com.wm.shardingspherejdbc.mapper.MemberMapper;
import com.wm.shardingspherejdbc.model.Member;
import com.wm.shardingspherejdbc.service.IMemberService;
import org.springframework.stereotype.Service;

/**
 * @author: wangm
 * @date: 2021/7/23 14:43
 * @Description
 */
@Service
public class MemberServiceImpl implements IMemberService {
    private MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public int insert(Member record) {
        return memberMapper.insert(record);
    }

    @Override
    public Member getMemberByPrimaryKey(Long memberId) {
        return memberMapper.getMemberByPrimaryKey(memberId);
    }

    @Override
    public int deleteByPrimaryKey(Long memberId) {
        return memberMapper.deleteByPrimaryKey(memberId);
    }
}
