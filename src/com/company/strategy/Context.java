package com.company.strategy;

/**
 * Created by volodyko on 05.05.16.
 */
public class Context {
    Choice myChoice;

    public void setMyChoice(Choice choice) {
        myChoice = choice;
    }

    public void showMyChoice(String arg1, String arg2) {
        if (myChoice != null) {
            myChoice.myChoice(arg1, arg2);
        }
    }
}
