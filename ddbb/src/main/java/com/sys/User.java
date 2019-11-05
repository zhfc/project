package com.sys;

import lombok.Data;

import java.util.Date;

/**
 * 账户玩家
 */
@Data
public class User {

    private Integer userId;
    private String userName;        //用户名
    private byte userSex;             //用户性别
    private Integer userAge;
    private String userPassword;        //密码
    private String userTel;             //电话
    private String userQq;              //QQ
    private String userWechat;          //微信
    private String userAlipay;          //支付宝
    private String userIcard;           //身份证号
    private String userEmail;           //邮箱
    private Date userCreateTime;        //用户创建时间

}
