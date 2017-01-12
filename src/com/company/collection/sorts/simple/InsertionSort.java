package com.company.collection.sorts.simple;

/**
 * Created by volodyko on 05.01.17.
 */
public class InsertionSort extends BubbleArray {
    public InsertionSort(int size) {
        super(size);
    }

    @Override
    public void sort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    @Override
    protected void swap(int l, int l1) {
        super.swap(l, l1);
    }

    static class Launcher {
        public static void main(String[] args) {
            int size = 100;
            InsertionSort arr = new InsertionSort(size);

            arr.insert(77);
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(88);
            arr.insert(11);
            arr.insert(00);
            arr.insert(-1);
            arr.insert(66);
            arr.insert(33);
            arr.insert(-33);

            arr.display();

            long start = System.currentTimeMillis();
            arr.sort();
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration);
            arr.display();
        }
    }
}
