package com.rongwei.yxfdesignpattern.activity.observer.myself;

/**
 * Created by Administrator on 2017/10/10.
 */

/**
 * 足球
 */
public class ZuQiuObserver implements Observer{

    public void registerObserver(SubjectObserver subjectObserver){
        subjectObserver.registerObserver(this);
    }

    public void unregisterObserver(SubjectObserver subjectObserver){
        subjectObserver.unRegiseterObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
