package com.rongwei.yxfdesignpattern.activity.observer.myself;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */

public class ObjectForZuQiu implements SubjectObserver {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        this.notifity();
    }

    private List<Observer>observers=new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegiseterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifity() {
        for (Observer observer:observers) {
            observer.update(msg);
        }
    }
}
