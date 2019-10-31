package com.game.entity.game;

import lombok.Data;

/**
 * 玩家实体
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class Player extends People{


    private String id;
    private String playNme;         //游戏名
    private double money;           //充值钱币
    private int level;              //等级
    private Navigator navigator;    //导航器
    private Integer longitude;      //经度（游戏）
    private Integer latitude;       //纬度（游戏）

}
