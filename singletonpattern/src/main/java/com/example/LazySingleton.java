package com.example;

/**
 * Created by yuanzhuang on 2017/7/6.
 */

public class LazySingleton {
    //关于为什么一定需要加入volatile关键字,参见http://crud0906.iteye.com/blog/576321
    private volatile static EagerSingleton instance;

    public static EagerSingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new EagerSingleton();
                }
            }
        }
        return instance;
    }
}
