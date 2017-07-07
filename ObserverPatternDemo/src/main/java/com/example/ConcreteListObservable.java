package com.example;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Observable;

/**
 * Created by yuanzhuang on 2017/7/5.
 */

public class ConcreteListObservable extends Observable {
    private ArrayList mList;

    public ConcreteListObservable() {

    }

    public ConcreteListObservable(ArrayList list) {
        mList = list;
    }

    //增加
    public void add(Object object) {
        if (object != null && !mList.contains(object)) {
            mList.add(object);
            fireEvent(new ObserveListEvent(1,object));
        }
    }

    //删除
    public void remove(Object object) {
        if (object != null && mList.contains(object)) {
            mList.remove(object);
            fireEvent(new ObserveListEvent(-1,object));
        }
    }

    //更新
    public void update(Object object) {
        if (object != null && mList.contains(object)) {
            mList.remove(object);
            fireEvent(new ObserveListEvent(0,object));
        }
    }

    //通知更新
    public void fireEvent(EventObject eventObject) {
        setChanged();
        notifyObservers(eventObject);
    }


}
