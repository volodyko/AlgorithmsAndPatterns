package com.company.collection.sorts.simple;

/**
 * Created by volodyko on 05.01.17.
 */
public class BinarySearch {
    private final int mas[];

    public BinarySearch(int[] mas) {
        this.mas = mas;
    }

    public int find(int searchKey) {
        int loverBound = 0;
        int upperBound = mas.length - 1;
        return find(searchKey, loverBound, upperBound);
    }

    private int find(int searchKey, int loverBound, int upperBound) {
        int curIn = (loverBound + upperBound) / 2;
        System.out.println("curIn: " + curIn);
        if (mas[curIn] == searchKey) {
            return curIn;
        } else if (loverBound > upperBound) {
            return -1;
        } else {
            if (mas[curIn] < searchKey) {
                return find(searchKey, curIn + 1, upperBound);
            } else {
                return find(searchKey, loverBound, curIn - 1);
            }
        }
    }
}
