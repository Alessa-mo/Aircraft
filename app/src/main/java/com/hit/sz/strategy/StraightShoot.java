package com.hit.sz.strategy;

import com.hit.sz.aircraft.AbstractAircraft;
import com.hit.sz.bullet.BaseBullet;
import com.hit.sz.bullet.EnemyBullet;
import com.hit.sz.bullet.HeroBullet;

import java.util.LinkedList;
import java.util.List;
public class StraightShoot implements ShootStrategy{
    private String aircraftType;

    public  StraightShoot(String type){
        this.aircraftType = type;
    }

    /**
     * 直射策略
     * @return List<BaseBullet>
     */
    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft){
        List<BaseBullet> res = new LinkedList<>();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + aircraft.getDirection()*2;
        int bulletSpeedX = 0;
        int bulletSpeedY = aircraft.getSpeedY() + aircraft.getDirection()*3;
        BaseBullet abstractBullet;
        for(int i=0; i<aircraft.getShootNum(); i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            if(aircraftType=="HeroAircraft"){
                abstractBullet = new HeroBullet(x + (i*2 - aircraft.getShootNum() + 1)*10, y, bulletSpeedX, bulletSpeedY, aircraft.getPower());
            }
            else{
                abstractBullet = new EnemyBullet(x + (i*2 - aircraft.getShootNum() + 1)*10, y, bulletSpeedX, bulletSpeedY, aircraft.getPower());
            }
            res.add(abstractBullet);
        }
        return res;

    }
}
