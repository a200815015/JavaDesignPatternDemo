package com.example;

/**
 * Created by yuanzhuang on 2017/7/10.
 */

public abstract class Decorator implements Component {
    private Component mComponent;

    public Decorator(Component component) {
        mComponent = component;
    }

    @Override
    public void display() {
        mComponent.display();
    }
}
