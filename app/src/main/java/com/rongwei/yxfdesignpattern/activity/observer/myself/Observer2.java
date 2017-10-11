package com.rongwei.yxfdesignpattern.activity.observer.myself;

/**
 * Created by Administrator on 2017/10/10.
 */

public class Observer2 implements Observer {
    public void registerObserver(SubjectObserver subjectObserver){
        subjectObserver.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
