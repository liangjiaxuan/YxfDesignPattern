package com.rongwei.yxfdesignpattern.activity.strategy.display;

import com.rongwei.yxfdesignpattern.activity.strategy.DisplayBehavior;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Display1 implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("角色的样子------1");
    }
}
