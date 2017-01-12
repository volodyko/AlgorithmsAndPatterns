package com.company.templatemethod;

/**
 * Created by volodyko on 05.05.16.
 */
public class TemplateMethodMain {

    public static void main(String[] args) {
        BasicEngineering bs = new ComputerScience();
        bs.papers();
        System.out.println();
        bs = new Electronic();
        bs.papers();
    }
}
