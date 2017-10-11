package com.rongwei.yxfdesignpattern.activity.observer.yxf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */

public class YxfLoveNews implements YxfObservale {
    private String msg;
    private List<Yxfobserver>yxfobservers=new ArrayList<>();
    public void setMsg(String msg) {
        this.msg = msg;
        this.notifyAllObservers();
    }


    @Override
    public void registerObserver(Yxfobserver yxfobserver) {
        yxfobservers.add(yxfobserver);
    }

    @Override
    public void unregisterObserver(Yxfobserver yxfobserver) {
        yxfobservers.remove(yxfobserver);
    }

    @Override
    public void notifyAllObservers() {
        for (Yxfobserver yxfObserver:yxfobservers) {
            yxfObserver.update(msg);
        }
    }
}
