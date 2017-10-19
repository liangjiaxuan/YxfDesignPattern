package com.rongwei.yxfdesignpattern;

import android.app.Application;

import com.rongwei.yxfdesignpattern.exception.CrashHandler;

/**
 * Created by Administrator on 2017/10/19.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
