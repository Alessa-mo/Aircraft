package com.hit.sz.strategy;

import com.hit.sz.aircraft.AbstractAircraft;
import com.hit.sz.bullet.BaseBullet;

import java.util.List;

public interface ShootStrategy {
    public List<BaseBullet> shoot(AbstractAircraft aircraft);
}
