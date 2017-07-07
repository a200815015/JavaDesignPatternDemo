package com.example;

/**
 * Created by yuanzhuang on 2017/7/7.
 */
//initialization on demand holder
public class IoDHSingleton {

    private static class Holder {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return Holder.instance;
    }
}
