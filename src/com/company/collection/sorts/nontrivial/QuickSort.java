package com.company.collection.sorts.nontrivial;

/**
 * Created by volodyko on 12.01.17.
 */
public class QuickSort {

    public static void main(String[] args) {
        int maxSize = 16;

        ArrayIns arrayIns = new ArrayIns(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long) (Math.random() * 99);
            arrayIns.insert(n);
        }

        arrayIns.display();

        arrayIns.quickSort();
        arrayIns.display();

    }


    static class ArrayIns {
        private long[] array;
        private int nElems;

        public ArrayIns(int max) {
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

        public void quickSort() {
            recQuickSort(0, nElems - 1);
        }

        private void recQuickSort(int left, int right) {
            if (right - left <= 0) {
                return;
            } else {
                long pivot = array[right];

                int partition = partitionint(left, right, pivot);
                recQuickSort(left, partition - 1);
                recQuickSort(partition + 1, right);
            }
        }

        private int partitionint(int left, int right, long pivot) {
            int leftPtr = left - 1;
            int rightPtr = right;
            while (true) {
                while (array[++leftPtr] < pivot) ;
                while (rightPtr > 0 && array[--rightPtr] > pivot) ;

                if (leftPtr >= rightPtr) {
                    break;
                } else {
                    swap(leftPtr, rightPtr);
                }

            }
            swap(leftPtr, right); // pivot swap
            return leftPtr;
        }

        private void swap(int leftPtr, int rightPtr) {
            long temp = array[leftPtr];
            array[leftPtr] = array[rightPtr];
            array[rightPtr] = temp;
        }
    }
}
