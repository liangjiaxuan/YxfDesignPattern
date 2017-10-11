package com.rongwei.yxfdesignpattern.activity.strategy.person.travel;

import com.rongwei.yxfdesignpattern.activity.strategy.person.TravelStragy;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Plane implements TravelStragy {
    @Override
    public void travel() {
        System.out.println("坐飞机去");
    }
}
