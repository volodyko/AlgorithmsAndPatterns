package com.company.collection;

import com.company.collection.sorts.simple.BubbleArray;

/**
 * Created by volodyko on 05.01.17.
 */
public class OrederedArray {
    protected long[] a;
    protected int nElems;

    public OrederedArray(int size) {
        a = new long[size];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void sort() {

    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
        }

        a[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static class Launcher {
        public static void main(String[] args) {
            int maxSize = 100;
            BubbleArray arr = new BubbleArray(maxSize);

            arr.insert(77);
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(88);
            arr.insert(11);
            arr.insert(00);
            arr.insert(66);
            arr.insert(33);

            int searchKey = 55;

            long start = System.currentTimeMillis();
            long findfind = arr.find(searchKey);
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration);
            if (findfind != arr.size()) {
                System.out.println("Found: " + searchKey);
            } else {
                System.out.println("Not found");
            }
            arr.display();

            arr.delete(00);
            arr.delete(55);
            arr.delete(99);


            start = System.currentTimeMillis();
            duration = System.currentTimeMillis() - start;
            findfind = arr.find(55);
            System.out.println("Duration: " + duration);
            if (findfind != arr.size()) {
                System.out.println("Found: " + searchKey);
            } else {
                System.out.println("Not found");
            }
            arr.display();

        }
    }
}


