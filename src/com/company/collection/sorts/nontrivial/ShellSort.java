package com.company.collection.sorts.nontrivial;

/**
 * Created by volodyko on 11.01.17.
 */
public class ShellSort {

    public static void main(String[] args) {
        int maxSize = 10;
        ArraySh arraySh = new ArraySh(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (int) (Math.random() * 99);
            arraySh.insert(n);
        }
        arraySh.display();
        arraySh.shellSort();
        arraySh.display();
    }

    static class ArraySh {
        private long[] array;
        private int nElems;

        public ArraySh(int max) {
            array = new long[max];
            nElems = 0;
        }

        public void insert(long value) {
            array[nElems] = value;
            nElems++;
        }

        public void display() {
            System.out.print("A=");
            for (int j = 0; j < nElems; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println("");
        }

        public void shellSort() {
            int inner, outer;
            long temp;
            int h = 1;
            while (h <= nElems / 3) {
                h = h * 3 + 1;
            }
            System.out.println("h = " + h);
            while (h > 0) {
                for (outer = h; outer < nElems; outer++) {
                    temp = array[outer];
                    inner = outer;

                    while (inner > h - 1 && array[inner - h] >= temp) {
                        array[inner] = array[inner - h];
                        inner -= h;
                    }
                    array[inner] = temp;
                }
                h = (h - 1) / 3;
            }
        }
    }
}
