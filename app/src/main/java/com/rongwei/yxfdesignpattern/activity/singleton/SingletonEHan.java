package com.rongwei.yxfdesignpattern.activity.singleton;

/**
 * Created by Administrator on 2017/10/10.
 */

public class SingletonEHan {

    private static SingletonEHan instance=new SingletonEHan();

    public static SingletonEHan getInstance(){
        return instance;
    }


    /**
     * 第二种写法(基本上没有什么区别)
     *
     */
    private static SingletonEHan singletonEHanTwo=null;
    static {
        singletonEHanTwo=new SingletonEHan();
    }
    public static SingletonEHan getSingletonEHanTwo(){
        if (singletonEHanTwo==null) {
            singletonEHanTwo=new SingletonEHan();
        }
        return singletonEHanTwo;
    }
}
