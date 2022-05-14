package com.hit.sz.factory;

import com.hit.sz.aircraft.Boss;
import com.hit.sz.aircraft.BaseEnemy;
import com.hit.sz.application.ImageManager;
import com.hit.sz.application.Main;
import com.hit.sz.strategy.ScatteringShoot;

/**Boss敌机工厂*/
public class BossFactory extends BaseEnemyFactory{

    @Override
    public BaseEnemy createEnemy(){
        BaseEnemy boss = new Boss((int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.BOSS_IMAGE.getWidth()))*1,
                (int) (ImageManager.BOSS_IMAGE.getHeight()/2)*1,
                3,
                0,
                 hp,
                3,
                power,
                1);
        boss.setShootStrategy(new ScatteringShoot("Enmey"));
        return boss;
    };
}
