package com.example;

/**
 * Created by yuanzhuang on 2017/7/10.
 */

public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setBlackBorder();
    }

    private void setBlackBorder() {
        System.out.print("==>add blackBorder");
    }
}
