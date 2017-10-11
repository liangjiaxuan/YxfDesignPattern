package com.rongwei.yxfdesignpattern.activity.observer.system;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/10/10.
 */

/**
 * 观察者2
 */
public class Obsever2 implements Observer {

    public void registerObserver(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("----");
    }
}
