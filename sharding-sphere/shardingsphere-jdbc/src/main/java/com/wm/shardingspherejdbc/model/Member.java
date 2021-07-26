package com.wm.shardingspherejdbc.model;

import lombok.Data;

import java.util.Date;

/**
 * @author: wangm
 * @date: 2021/7/23 14:37
 * @Description
 */

@Data
public class Member {
    private Long memberId;

    private String memberName;

    private String nickName;

    private String accountNo;

    private String password;

    private Integer age;

    private Date birthDate;

    private String eblFlag;

    private String delFlag;

    private String description;

    private Date createTime;

    private Date updateTime;
}
