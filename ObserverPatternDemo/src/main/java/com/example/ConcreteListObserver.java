package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yuanzhuang on 2017/7/5.
 *
 */

public class ConcreteListObserver implements Observer {
    private final String ObserverName;

    public ConcreteListObserver(String observerName) {
        ObserverName = observerName;
    }

    @Override
    public void update(Observable observable, Object o) {
        if (o != null && o instanceof ObserveListEvent) {
            ObserveListEvent event = (ObserveListEvent) o;
            if (event.getCode() == 1) {
                System.out.println(this.getObserverName() + "..." + "add " + "event \"" + event.getSource() + "\" arrived");
            } else if (event.getCode() == -1) {
                System.out.println(this.getObserverName() + "..." + "remove " + "event \"" + event.getSource() + "\" arrived");
            } else if (event.getCode() == 0) {
                System.out.println(this.getObserverName() + "..." + "update " + "event \"" + event.getSource() + "\" arrived");
            }
        }

    }

    public String getObserverName() {
        return ObserverName;
    }
}
