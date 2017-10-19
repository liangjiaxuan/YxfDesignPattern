package com.rongwei.yxfdesignpattern.activity;

import android.webkit.JavascriptInterface;

/**
 * Created by Administrator on 2017/10/17.
 */

public class AndroidtoJs {

    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    public void hello(String msg) {
        System.out.println("JS调用了Android的hello方法");
    }
}
