package com.rongwei.yxfdesignpattern.activity.observer.yxf;

/**
 * Created by Administrator on 2017/10/10.
 */

/**
 * 被观察者
 */
public interface YxfObservale {
    void registerObserver(Yxfobserver yxfobserver);

    void unregisterObserver(Yxfobserver yxfobserver);

    void notifyAllObservers();
}
