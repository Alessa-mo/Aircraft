package com.hit.sz.prop;
import com.hit.sz.basic.AbstractFlyingObject;
import com.hit.sz.aircraft.HeroAircraft;

public abstract class BaseProp extends AbstractFlyingObject{
    public BaseProp(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }
    public abstract void propFunction(HeroAircraft heroAircraft);
}
