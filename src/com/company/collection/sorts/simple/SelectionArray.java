package com.company.collection.sorts.simple;

/**
 * Created by volodyko on 05.01.17.
 */
public class SelectionArray extends BubbleArray {
    public SelectionArray(int size) {
        super(size);
    }

    @Override
    public void sort() {
        int out, in, min;

        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    static class Launcher {
        public static void main(String[] args) {
            int size = 100;
            SelectionArray arr = new SelectionArray(size);
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
