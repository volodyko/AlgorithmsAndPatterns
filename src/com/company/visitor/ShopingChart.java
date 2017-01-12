package com.company.visitor;

import java.util.ArrayList;

/**
 * Created by volodyko on 12.04.16.
 */
public class ShopingChart {
    //normal shopping cart stuff
    private ArrayList<Visitable> items;

    public ShopingChart(ArrayList<Visitable> items) {
        this.items = items;
    }

    public double calculatePostage() {
        //create a visitor
        PostageVisitor visitor = new PostageVisitor();
        //iterate through all items
        for (Visitable item : items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostageForCart();
        return postage;
    }
}
