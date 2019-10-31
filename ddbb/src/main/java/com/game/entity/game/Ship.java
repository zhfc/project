package com.game.entity.game;

import lombok.Data;

/**
 * 船
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class Ship {

    private String id;
    private String name;
    private String type;
    private Integer longitude;      //经度（游戏）
    private Integer latitude;       //纬度（游戏）
    private String description;     //描述


}
