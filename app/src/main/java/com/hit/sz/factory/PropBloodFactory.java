package com.hit.sz.factory;

import com.hit.sz.prop.BaseProp;
import com.hit.sz.prop.PropBlood;

/**加血道具工厂*/
public class PropBloodFactory implements PropFactory{
    @Override
    public BaseProp createProp(int locationX, int locationY){
        return new PropBlood(locationX, locationY, 0, 5);
    }
}
