package com.rongwei.yxfdesignpattern.activity.strategy.attck;

import com.rongwei.yxfdesignpattern.activity.strategy.AttackBehavior;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Attack3 implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("吾来神掌");
    }
}
