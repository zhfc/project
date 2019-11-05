package com.game.entity;

import lombok.Data;

import java.util.List;

/**
 * 怪（可杀并且会主动攻击自己者是也）
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class Monster {

    private int level;
    private String name;
    private String description;
    private int health;
    private int attack;     //攻击
    private int defense;    //防御
    private List<Skill> skillList; //技能


}
