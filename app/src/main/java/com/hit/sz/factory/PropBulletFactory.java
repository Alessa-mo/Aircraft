package com.hit.sz.factory;

import com.hit.sz.prop.BaseProp;
import com.hit.sz.prop.PropBullet;

/**火力道具工厂*/
public class PropBulletFactory implements PropFactory{
    @Override
    public BaseProp createProp(int locationX, int locationY){
        return new PropBullet(locationX, locationY, 0, 5);
    }
}
