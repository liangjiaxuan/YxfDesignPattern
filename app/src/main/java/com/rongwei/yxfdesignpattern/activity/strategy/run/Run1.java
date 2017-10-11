package com.rongwei.yxfdesignpattern.activity.strategy.run;

import com.rongwei.yxfdesignpattern.activity.strategy.RunBeHavior;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Run1 implements RunBeHavior {
    @Override
    public void run() {
        System.out.println("逃跑方式-------1");
    }
}
