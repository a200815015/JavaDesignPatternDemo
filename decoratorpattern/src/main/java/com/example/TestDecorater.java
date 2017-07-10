package com.example;

public class TestDecorater {

    public static void main(String[] arg) {
        Component mComponent = new ListBox();
        Component scrollBarDecorator = new ScrollBarDecorator(mComponent);
        Component blackBorderDecorator=new BlackBorderDecorator(scrollBarDecorator);
        blackBorderDecorator.display();
    }
}
