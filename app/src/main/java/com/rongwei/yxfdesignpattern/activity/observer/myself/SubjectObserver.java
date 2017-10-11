package com.rongwei.yxfdesignpattern.activity.observer.myself;

/**
 * Created by Administrator on 2017/10/10.
 */

public interface SubjectObserver {
    /**
     * 注册
     */
    void registerObserver(Observer observer);

    /**
     * 注销
     */
    void unRegiseterObserver(Observer observer);

    /**
     * 刷新
     */
    void notifity();
}
