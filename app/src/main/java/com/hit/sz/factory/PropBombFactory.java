package com.hit.sz.factory;

import com.hit.sz.prop.BaseProp;
import com.hit.sz.prop.PropBomb;

/**炸弹道具工厂*/
public class PropBombFactory implements PropFactory{
    @Override
    public BaseProp createProp(int locationX, int locationY){
        return new PropBomb(locationX, locationY, 0, 5);
    }
}
