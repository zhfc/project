package com.game.service.impl;

import com.game.entity.Player;
import com.game.service.PlayerService;
import com.utils.PKGenerator;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class PlayerServiceImpl implements PlayerService {



    @Override
    public void createPlayer(Player player) {

        String playId = PKGenerator.nextID();
        player.setPlayId(playId);

        //获取微信接口得到当前玩家的微信ID
        player.setUserId("1");



    }
}
