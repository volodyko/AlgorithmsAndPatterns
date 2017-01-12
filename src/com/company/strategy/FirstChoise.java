package com.company.strategy;

/**
 * Created by volodyko on 05.05.16.
 */
public class FirstChoise implements Choice {
    @Override
    public void myChoice(String arg1, String arg2) {
        System.out.println("First choice");
        int int1, int2, sum;
        int1 = Integer.parseInt(arg1);
        int2 = Integer.parseInt(arg2);
        sum = int1 + int2;
        System.out.println("Sum is: " + sum);
    }
}
