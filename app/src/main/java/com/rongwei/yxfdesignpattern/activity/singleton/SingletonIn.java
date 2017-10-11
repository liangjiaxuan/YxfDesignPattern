package com.rongwei.yxfdesignpattern.activity.singleton;

/**
 * Created by Administrator on 2017/10/10.
 */

public class SingletonIn {

    public static class SingletonHolder{
        static SingletonIn instance=new SingletonIn();
    }

    public static SingletonIn getSingletonInstance(){
        return SingletonHolder.instance;
    }
}
