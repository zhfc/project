package entity.game;

import lombok.Data;

/**
 * 游戏人类
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class People {

    private String name;        //姓名
    private String sex;         //性别
    private int age;            //年龄
    private String description; //描述
    private String profession;  //职业
    private String skill;       //技能

}
