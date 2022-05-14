package com.hit.sz.factory;

import com.hit.sz.aircraft.EliteEnemy;
import com.hit.sz.aircraft.BaseEnemy;
import com.hit.sz.application.ImageManager;
import com.hit.sz.application.Main;
import com.hit.sz.strategy.StraightShoot;

/**精英敌机工厂*/
public class EliteEnemyFactory extends BaseEnemyFactory{
    @Override
    public BaseEnemy createEnemy(){
        double r = Math.random();
        int speedX;
        if(r < 0.5){
            speedX = 3;
        }
        else{
            speedX = -3;
        }
        BaseEnemy eliteEnemy = new EliteEnemy((int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()))*1,
                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,
                speedX,
                5,
                hp, 1, power, 1);
        eliteEnemy.setShootStrategy(new StraightShoot("Enmey"));
        return eliteEnemy;
    }
}
