package com.company.collection.sorts.simple;

import com.company.collection.OrederedArray;

/**
 * Created by volodyko on 05.01.17.
 */
public class BubbleArray extends OrederedArray {
    public BubbleArray(int size) {
        super(size);
    }

    @Override
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }


    public void sort() {
        int out, in;
        for (out = nElems - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    protected void swap(int l, int l1) {
        long temp = a[l];
        a[l] = a[l1];
        a[l1] = temp;
    }

    public static class Launcher {
        public static void main(String[] args) {
            int size = 500;
            BubbleArray arr = new BubbleArray(size);
            for (int i = size; i > 0; i--) {
                arr.insert(i);
            }

            arr.display();

            long start = System.currentTimeMillis();
            arr.sort();
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration);
            arr.display();

        }
    }


}
