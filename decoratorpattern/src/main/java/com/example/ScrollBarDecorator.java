package com.example;

/**
 * Created by yuanzhuang on 2017/7/10.
 */

public class ScrollBarDecorator extends Decorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setScrollBar();
    }

    private void setScrollBar() {
        System.out.print("==>add scrollbar");
    }
}
