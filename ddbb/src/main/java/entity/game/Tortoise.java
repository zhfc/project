package entity.game;

import lombok.Data;

/**
 * 墨龟
 * 神的代理
 * 众多玩家眼里的先知
 * 众多玩家眼里的神
 * 众多玩家眼里的统治者--万王之王
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class Tortoise {

    private String id;
    private String name;
    private String age;
    private String sex;
    private String description;

}
