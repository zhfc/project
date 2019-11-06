package com.game.controller;


import com.game.entity.Player;
import com.game.entity.Ship;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 海盗船
 */
@Api(tags = "海盗船相关")
@RestController
@RequestMapping(value = "/ship")
public class ShipController {

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
     * 创建战船
     * @return
     */
    @PostMapping("/create")
    @ApiOperation(value = "创建战船", notes = "创建战船")
    public String create(@RequestBody Ship ship){

        return "success";
    }

    /**
     * 删除战船
     * @return
     */
    @PostMapping("/delete")
    @ApiOperation(value = "删除战船", notes = "删除战船")
    public String delete(@RequestBody Ship ship){

        return "success";
    }

}
