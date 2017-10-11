package com.rongwei.yxfdesignpattern.activity.factory;

import android.util.Log;

/**
 * Created by Administrator on 2017/10/10.
 */

public abstract class RouJiaMo {
    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        Log.e("---RoujiaMo:", name + ": 揉面-剁肉-完成准备工作");
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        Log.e("---RoujiaMo:", name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        Log.e("---RoujiaMo:", name + ": 肉夹馍-专用袋-包装---end");
    }
}
