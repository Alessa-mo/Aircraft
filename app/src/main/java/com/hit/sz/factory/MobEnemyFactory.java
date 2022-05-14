package com.hit.sz.factory;
import com.hit.sz.aircraft.*;
import com.hit.sz.application.ImageManager;
import com.hit.sz.application.Main;

/**普通敌机工厂*/
public class MobEnemyFactory extends BaseEnemyFactory{
    @Override
    public BaseEnemy createEnemy(){
        return new MobEnemy((int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.MOB_ENEMY_IMAGE.getWidth()))*1,
                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,
                0,
                5,
                hp, 0, power, 0);
    }
}
