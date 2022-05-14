package com.hit.sz.factory;

import com.hit.sz.prop.BaseProp;

public interface PropFactory {
    public BaseProp createProp(int locationX, int locationY);
}
