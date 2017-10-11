package com.rongwei.yxfdesignpattern.activity.singleton;

/**
 * Created by Administrator on 2017/10/10.
 */

/**
 * 懒汉模式
 */
public class SingletonLanHan {

    private static SingletonLanHan singletonLanHan=null;
    /**
     * 懒汉式双重校验锁  线程安全避免产生多个实例
     */
    public static SingletonLanHan getSingleLanhanInstance(){
        if (singletonLanHan==null) {
            synchronized (SingletonLanHan.class) {
                if (singletonLanHan==null) {
                    singletonLanHan=new SingletonLanHan();
                }
            }
        }
        return singletonLanHan;
    }
}

