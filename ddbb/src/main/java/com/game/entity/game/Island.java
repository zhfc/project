package com.game.entity.game;

import lombok.Data;

/**
 * 岛屿
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class Island {

    private String id;
    private String name;            //岛名
    private double area;            //岛屿面积
    private double enableArea;      //可用面积      用来建造建筑，农田使用
    private double disableArea;     //不可用面积     用来放牧
    private Integer longitude;      //经度（游戏）
    private Integer latitude;       //纬度（游戏）
    private double fertile;         //肥沃度
    private String description;     //描述

}
