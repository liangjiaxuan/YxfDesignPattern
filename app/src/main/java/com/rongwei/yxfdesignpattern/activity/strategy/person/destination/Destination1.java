package com.rongwei.yxfdesignpattern.activity.strategy.person.destination;

import com.rongwei.yxfdesignpattern.activity.strategy.person.DestinationStragy;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Destination1 implements DestinationStragy {
    @Override
    public void destination() {
        System.out.println("去上海玩");
    }
}
