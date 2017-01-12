package com.company.decorator;

/**
 * Created by volodyko on 05.05.16.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle with Red border");
        redCircle.draw();
        System.out.println("\nRectangle with Red border");
        redRectangle.draw();
    }
}
