package com.company.collection.sorts.nontrivial;

/**
 * Created by volodyko on 12.01.17.
 */
public class QuickSortMedian {

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
            int size = right - left + 1;
            if (size <= 10) {
                insertionSort(left, right);
            } else {
                long median = medianOf3(left, right);

                int partition = partitionint(left, right, median);
                recQuickSort(left, partition - 1);
                recQuickSort(partition + 1, right);
            }
        }

        private void insertionSort(int left, int right) {
            int in, out;
            for (out = left + 1; out <= right; out++) {
                long temp = array[out];
                in = out;
                while (in > left && array[in - 1] > temp) {
                    array[in] = array[in - 1];
                    --in;
                }
                array[in] = temp;
            }
        }

        private void manualSort(int left, int right, int size) {
            if (size <= 1) {
                return;
            }
            if (size == 2) {
                if (array[left] > array[right]) {
                    swap(left, right);
                }
                return;
            } else {
                if (array[left] > array[right - 1]) {
                    swap(left, right - 1); //left, center
                }
                if (array[left] > array[right]) {
                    swap(left, right);  //left,right
                }
                if (array[right - 1] > array[right]) {
                    swap(right - 1, right); //center right
                }

            }
        }

        public long medianOf3(int left, int right) {
            int center = (left + right) / 2;
            if (array[left] > array[center]) {
                swap(left, center);
            }
            if (array[left] > array[right]) {
                swap(left, right);
            }
            if (array[center] > array[right]) {
                swap(center, right);
            }
            swap(center, right - 1);
            return array[right - 1];
        }

        private int partitionint(int left, int right, long pivot) {
            int leftPtr = left;
            int rightPtr = right - 1;
            while (true) {
                while (array[++leftPtr] < pivot) ;
                while (array[--rightPtr] > pivot) ;

                if (leftPtr >= rightPtr) {
                    break;
                } else {
                    swap(leftPtr, rightPtr);
                }

            }
            swap(leftPtr, right - 1); // pivot restore
            return leftPtr;
        }

        private void swap(int leftPtr, int rightPtr) {
            long temp = array[leftPtr];
            array[leftPtr] = array[rightPtr];
            array[rightPtr] = temp;
        }
    }
}
