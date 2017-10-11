package com.rongwei.yxfdesignpattern.activity.observer.yxf;

/**
 * Created by Administrator on 2017/10/10.
 */

public class YxfObserver2 implements Yxfobserver {

    public void registerObserver(YxfObservale yxfObservale){
        yxfObservale.registerObserver(this);
    }

    private void unregister(YxfObservale yxfObservale){
        yxfObservale.unregisterObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println("YxfObserver2-----"+msg);
    }
}
