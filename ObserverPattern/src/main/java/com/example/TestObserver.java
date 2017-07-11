package com.example;

import java.util.ArrayList;
import java.util.Observer;

public class TestObserver {
    public static void main(String[] arg){
        ArrayList<String> mList=new ArrayList<>();
        ConcreteListObservable observable=new ConcreteListObservable(mList);
        Observer observer1=new ConcreteListObserver("observer1");
        Observer observer2=new ConcreteListObserver("observer2");
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.add("window");
        observable.add("linux");
        observable.deleteObserver(observer1);
        observable.add("ios");
        observable.remove("ios");
        observable.update("linux");

    }
}
