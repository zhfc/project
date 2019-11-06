package com.game.entity;

import lombok.Data;

import java.util.List;

/**
 * 玩家实体
 * @Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
 * 在IDEA中需要下载插件
 */
@Data
public class Player extends People{

    private String playId;
    private String userId;
    private String playNme;                 //游戏名
    private String playSex;                 //游戏性别
    private double playMoney;               //充值钱币
    private int playLevel;                  //等级
    private List<Skill> playSkillList;      //技能
    private String playSkills;              //xxxxx
    private Integer longitude;              //经度（游戏）
    private Integer latitude;               //纬度（游戏）
    private Integer playPlace;                  //游戏角色所处地方
    private Long playCoin;                  //虚拟游戏币
    private double experience;              //经验

}

