package com.rongwei.yxfdesignpattern;

import android.os.Environment;

import java.io.File;

/**
 * Created by Administrator on 2017/10/19.
 */

public class FileUtils {
    public static final String CACHE_PATH = "/QuPei/yxfCrashLog/";

    /**
     * 视频的缓存地址
     * @return
     */
    public static String getCrashPath() {
        String cache = "";
        //往SD卡中保存特定的内容可以使用getExternalStoragePublicDirectory   Environment.DIRECTORY_DCIM存到系统的DCIM下
        File dcim = Environment
                .getExternalStorageDirectory();
            cache = dcim.getPath() + CACHE_PATH;
        return cache;
    }
}
