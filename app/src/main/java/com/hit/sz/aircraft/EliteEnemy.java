package com.hit.sz.aircraft;


import com.hit.sz.Prop.BaseProp;
import com.hit.sz.application.Main;

import com.hit.sz.application.Subscriber;
import com.hit.sz.factory.PropBombFactory;
import com.hit.sz.factory.PropFactory;
import com.hit.sz.factory.PropImmuneFactory;
import com.hit.sz.factory.RandomPropFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * 精英敌机
 * 可以射击
 *
 * @author hitsz
 */

public class EliteEnemy extends BaseEnemy implements Subscriber {

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp, int shootNum, int power, int direction) {
        super(locationX, locationY, speedX, speedY, hp, shootNum, power, direction);
    }


    @Override
    public void forward() {
        super.forward();
        // 判定 y 轴向下飞行出界
        if (locationY >= Main.WINDOW_HEIGHT ) {
            vanish();
        }
    }

    @Override
    public List<BaseProp> dropProp(){
        RandomPropFactory randomPropFactory = new RandomPropFactory();
        PropFactory propFactory = randomPropFactory.createPropFactory();
        if(propFactory == null){
            return null;
        }
        List<BaseProp> prop = new LinkedList<>();
        prop.add(propFactory.createProp(this.getLocationX(), this.getLocationY()));
        return prop;
    }

    @Override
    public void update(){
        this.decreaseHp(this.getHp());
    }

}
