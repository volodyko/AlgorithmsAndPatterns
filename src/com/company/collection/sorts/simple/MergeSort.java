package com.company.collection.sorts.simple;

/**
 * Created by volodyko on 11.01.17.
 */
public class MergeSort {

    public static void main(String[] args) {
        int maxSize = 100;
        DArray array = new DArray(maxSize);
        array.insert(64);
        array.insert(21);
        array.insert(33);
        array.insert(70);
      /*  array.insert(12);
        array.insert(85);
        array.insert(44);
        array.insert(3);
        array.insert(99);
        array.insert(0);
        array.insert(108);
        array.insert(36);*/

        array.display();

        array.mergeSort();

        array.display();
    }

    static class DArray {
        private long[] array;
        private int nElems;

        public DArray(int max) {
            array = new long[max];
            nElems = 0;
        }

        public void insert(long valie) {
            array[nElems] = valie;
            nElems++;
        }

        public void display() {
            for (int j = 0; j < nElems; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println("");
        }

        public void mergeSort() {

            long[] workSpace = new long[nElems];

            recMergeSort(workSpace, 0, nElems - 1);
        }

        private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
            if (lowerBound == upperBound) {
                return;
            } else {
                int mid = (lowerBound + upperBound) / 2;

                recMergeSort(workSpace, lowerBound, mid);

                recMergeSort(workSpace, mid + 1, upperBound);


                merge(workSpace, lowerBound, mid + 1, upperBound);
            }
        }

        private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {

            int j = 0;
            int lowerBound = lowPtr;
            int mid = highPtr - 1;
            int n = upperBound - lowerBound + 1;

            while (lowPtr <= mid && highPtr <= upperBound) {
                if (array[lowPtr] < array[highPtr]) {
                    workSpace[j++] = array[lowPtr++];
                } else {
                    workSpace[j++] = array[highPtr++];
                }
            }

            while (lowPtr <= mid) {
                workSpace[j++] = array[lowPtr++];
            }

            while (highPtr <= upperBound) {
                workSpace[j++] = array[highPtr++];
            }

            for (j = 0; j < n; j++) {
                array[lowerBound + j] = workSpace[j];
            }
        }
    }
}
