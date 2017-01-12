package com.company.adapter;

/**
 * Created by volodyko on 09.05.16.
 */
public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle triangle) {
        calculator = new Calculator();
        this.triangle = triangle;
        Rect rect = new Rect(triangle.getBase(), 0.5 * triangle.getHeight());
        return calculator.getArea(rect);
    }
}
