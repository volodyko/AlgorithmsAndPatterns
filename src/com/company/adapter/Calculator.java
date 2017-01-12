package com.company.adapter;

/**
 * Created by volodyko on 09.05.16.
 */
public class Calculator {
    Rect rect;

    public double getArea(Rect rect) {
        this.rect = rect;
        return rect.getLength() * rect.getWidth();
    }
}
