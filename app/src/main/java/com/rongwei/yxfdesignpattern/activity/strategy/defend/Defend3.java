package com.rongwei.yxfdesignpattern.activity.strategy.defend;

import com.rongwei.yxfdesignpattern.activity.strategy.DefendBeHavior;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Defend3 implements DefendBeHavior{
    @Override
    public void defend() {
        System.out.println("魔抗加成-------");
    }
}
