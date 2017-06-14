package com.example.appkey;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/14
 *     desc  : -----------------
 * </pre>
 */
public class AppKey {
    static String key = null;
    static AppKey appkey = null;

    //导入动态链接库
    static {
        System.loadLibrary("Key");
    }


    public static AppKey initAppKey() {
        if (appkey == null) {
            appkey = new AppKey();
        }
        return appkey;
    }

    /**
     * 对外接口
     */
    public static String getAppKey() {
        if (key == null) {
            key = new AppKey().getKey();
        }
        return key;
    }

    //jni 接口函数
    private native String getKey();

}
