package com.hit.sz.strategy;

import com.hit.sz.aircraft.AbstractAircraft;
import com.hit.sz.bullet.BaseBullet;

import java.util.ArrayList;
import java.util.List;
public class NonShootStrategy implements ShootStrategy{
    public List<BaseBullet> shoot(AbstractAircraft aircraft){
        return new ArrayList<>();
    }
}
