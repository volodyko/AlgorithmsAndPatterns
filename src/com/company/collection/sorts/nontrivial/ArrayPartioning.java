package com.company.collection.sorts.nontrivial;

/**
 * Created by volodyko on 11.01.17.
 */
public class ArrayPartioning {

    public static void main(String[] args) {
        int maxSize = 16;
        ArrayPar array = new ArrayPar(maxSize);

        for (int i = 0; i < maxSize; i++) {
            array.insert((long) (Math.random() * 199));
        }

        array.display();

        long pivot = 99;
        System.out.println("Pivot = " + pivot);
        int size = array.size();
        int partDex = array.partitionit(0, size - 1, pivot);
        System.out.println("Partition is at index: " + partDex);
        array.display();

    }

    static class ArrayPar {
        private long[] array;
        private int elems;

        public ArrayPar(int size) {
            array = new long[size];
            elems = 0;
        }

        public void insert(long val) {
            array[elems] = val;
            elems++;
        }

        public int size() {
            return elems;
        }

        public void display() {
            System.out.print("A=");
            for (int j = 0; j < elems; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println("");
        }

        public int partitionit(int left, int right, long pivot) {
            int leftPtr = left - 1;
            int rightPtr = right + 1;
            while (true) {
                while (leftPtr < right && array[++leftPtr] < pivot) ; // find grater
                while (rightPtr > left && array[--rightPtr] > pivot) ; // find lower

                if (leftPtr >= rightPtr) {
                    break;
                } else {
                    swap(leftPtr, rightPtr);
                }
            }
            return leftPtr;
        }

        private void swap(int leftPtr, int rightPtr) {
            long temp;
            temp = array[leftPtr];
            array[leftPtr] = array[rightPtr];
            array[rightPtr] = temp;
        }


    }
}
