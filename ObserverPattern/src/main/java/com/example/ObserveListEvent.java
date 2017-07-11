package com.example;

import java.util.EventObject;

/**
 * Created by yuanzhuang on 2017/7/5.
 */

public class ObserveListEvent extends EventObject {
    private final int code;

    public ObserveListEvent(int code, Object o) {
        super(o);
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
