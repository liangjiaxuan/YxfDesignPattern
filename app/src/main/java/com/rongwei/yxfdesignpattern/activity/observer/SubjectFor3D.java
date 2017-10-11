package com.rongwei.yxfdesignpattern.activity.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2017/10/10.
 */

/**
 * 自定义一个被观察者
 */
public class SubjectFor3D extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }

}
