package com.wm.shardingspherejdbc.controller;

import com.wm.shardingspherejdbc.model.Member;
import com.wm.shardingspherejdbc.service.IMemberService;
import com.wm.shardingspherejdbc.util.IdWorker;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author: wangm
 * @date: 2021/7/23 15:24
 * @Description
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    private IMemberService memberService;

    public MemberController(IMemberService iMemberService) {
        this.memberService = iMemberService;
    }

    @PostMapping("/add")
    public Member add(){
        Member member = new Member();
        member.setMemberId(IdWorker.getLongId());
        member.setMemberName("张三");
        member.setNickName("闪耀的瞬间");
        member.setAccountNo(member.getMemberId()+"");
        member.setPassword("123465");
        member.setAge(27);
        member.setBirthDate(new Date());
        member.setEblFlag("1");
        member.setDelFlag("0");
        member.setDescription("xxx");
        member.setCreateTime(new Date());
        member.setUpdateTime(new Date());
        memberService.insert(member);

        return member;
    }

    @GetMapping("/findById/{id}")
    public Member findById(@PathVariable("id") Long id){
        return memberService.getMemberByPrimaryKey(id);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        memberService.deleteByPrimaryKey(id);
        return "success";
    }
}
