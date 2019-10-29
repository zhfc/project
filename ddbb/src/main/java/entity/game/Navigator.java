package entity.game;

import lombok.Data;

/**
 * 导航器
 */
@Data//@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的
public class Navigator {

    private boolean north;      //北走一步
    private boolean south;      //南走一步
    private boolean west;       //西走一步
    private boolean east;       //东走一步
    private boolean middle;     //中间（默认在中）

}
