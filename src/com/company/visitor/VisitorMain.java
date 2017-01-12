package com.company.visitor;

import java.util.ArrayList;

/**
 * Created by volodyko on 12.04.16.
 */
public class VisitorMain {
    public static void main(String[] args) {
        ArrayList<Visitable> items = new ArrayList<>();
        items.add(new Book(10, 15));
        items.add(new Book(5, 12));
        ShopingChart chart = new ShopingChart(items);
        System.out.println(chart.calculatePostage());
    }


}
