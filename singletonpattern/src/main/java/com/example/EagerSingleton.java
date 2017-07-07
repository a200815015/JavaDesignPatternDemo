package com.example;

/**
 * Created by yuanzhuang on 2017/7/6.
 *
 */

public class EagerSingleton {
    private static EagerSingleton instance=new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
