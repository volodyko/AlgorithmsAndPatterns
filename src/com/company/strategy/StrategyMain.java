package com.company.strategy;

import java.util.Scanner;

/**
 * Created by volodyko on 05.05.16.
 */
public class StrategyMain {
    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Demo***");
        Scanner in = new Scanner(System.in);//To take input from user
        Choice ic = null;
        Context cxt = new Context();
        String input1, input2;
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter an integer:");
                input1 = in.nextLine();
                System.out.println("Enter another integer:");
                input2 = in.nextLine();
                System.out.println("Enter ur choice(1 or 2)");
                System.out.println("Press 1 for Addition, 2 for Concatenation ");
                String c = in.nextLine();

                if (c.equals("1")) {
                    ic = new FirstChoise();
                } else {
                    ic = new SecondChoise();
                }
                cxt.setMyChoice(ic);
                cxt.showMyChoice(input1, input2);
            }
        } finally {
            in.close();
        }
        System.out.println("End of Strategy pattern");
    }
}
