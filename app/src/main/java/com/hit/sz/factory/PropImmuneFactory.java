package com.hit.sz.factory;

import com.hit.sz.prop.BaseProp;
import com.hit.sz.prop.PropImmune;

public class PropImmuneFactory implements PropFactory{
    @Override
    public BaseProp createProp(int locationX, int locationY){return new PropImmune(locationX,locationY,0,5);}
}
