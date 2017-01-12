package com.company.decorator;

/**
 * Created by volodyko on 05.05.16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
