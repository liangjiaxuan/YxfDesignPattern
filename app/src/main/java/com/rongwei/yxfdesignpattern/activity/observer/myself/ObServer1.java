package com.rongwei.yxfdesignpattern.activity.observer.myself;

/**
 * Created by Administrator on 2017/10/10.
 */

public class ObServer1 implements Observer {

    public void regiseterObserver(SubjectObserver subjectObserver){
        subjectObserver.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
