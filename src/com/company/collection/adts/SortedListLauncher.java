package com.company.collection.adts;

/**
 * Created by volodyko on 10.01.17.
 */
public class SortedListLauncher {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.insert(20);
        sortedList.insert(40);

        sortedList.displayList();


        sortedList.insert(10);
        sortedList.insert(30);
        sortedList.insert(50);

        sortedList.displayList();

        sortedList.remove();

        sortedList.displayList();

    }
}
