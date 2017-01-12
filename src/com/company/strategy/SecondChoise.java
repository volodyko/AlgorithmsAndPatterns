package com.company.strategy;

/**
 * Created by volodyko on 05.05.16.
 */
public class SecondChoise implements Choice {
    @Override
    public void myChoice(String arg1, String arg2) {
        System.out.println("Second choice");
        System.out.println("result is: " + arg1 + arg2);
    }
}
