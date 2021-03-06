package com.hit.sz.aircraft;

import com.hit.sz.prop.BaseProp;
import com.hit.sz.application.Subscriber;

import java.util.List;


public abstract class BaseEnemy extends AbstractAircraft implements Subscriber {
    public BaseEnemy(int locationX, int locationY, int speedX, int speedY, int hp, int shootNum, int power, int direction){
        super(locationX, locationY, speedX, speedY, hp, shootNum, power, direction);
    }

    public abstract List<BaseProp> dropProp();
}
