package com.hit.sz.prop;
import com.hit.sz.aircraft.HeroAircraft;
import com.hit.sz.application.Game;
import com.hit.sz.application.Subscriber;
import com.hit.sz.music.MusicThread;

import java.util.ArrayList;
import java.util.List;

public class PropBomb extends BaseProp{
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void remind(){
        for(Subscriber subscriber:subscribers){
            subscriber.update();
        }
    }

    public PropBomb(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }
    @Override
    public void propFunction(HeroAircraft heroAircraft){
        if(Game.isMusicTurnOn()){
            new MusicThread("src/videos/bomb_explosion.wav").start();
        }
        System.out.println("BombSupply active!");
        remind();
    }

}
