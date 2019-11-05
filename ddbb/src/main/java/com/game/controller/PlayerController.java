package com.game.controller;


import com.game.entity.Player;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 玩家相关
 *
 */
@Api(tags = "玩家相关")
@RestController
@RequestMapping(value = "/player")
public class PlayerController {

    /**
     * 退出游戏时更新缓存
     * @return
     */
    @PostMapping("/exit")
    @ApiOperation(value = "退出游戏", notes = "退出游戏")
    public String exit(){

        return "success";
    }


    /**
     * 登录游戏
     * @return
     */
    @PostMapping("/login")
    @ApiOperation(value = "登陆游戏", notes = "登陆游戏")
    public String login(){

        return "success";
    }

    /**
     * 航行,航行为坐标移动
     * @param player
     * @return
     */
    @PostMapping("/navigate")
    @ApiOperation(value = "航行", notes = "航行")
    public String go(@RequestBody Player player) {


        return "success";
    }

    /**
     * 坐标内移动，即在一个坐标内的场地移动
     * @param player
     * @return
     */
    @PostMapping("/move")
    @ApiOperation(value = "坐标内移动", notes = "坐标内移动")
    public String move(@RequestBody Player player) {

        return "success";
    }

    /**
     * 传送定位，如果较远的地方可以选择传送师，直接更换
     * @param player
     * @return
     */
    @PostMapping("/locate")
    @ApiOperation(value = "传送定位", notes = "传送定位")
    public String locate(@RequestBody Player player) {

        return "success";
    }



}
