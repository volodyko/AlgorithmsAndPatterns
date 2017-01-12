package com.company.collection.linkedlist;

/**
 * Created by volodyko on 10.01.17.
 */
public class LauncherTwoWay {
    public static void main(String[] args) {
        TwoWayList<Integer> list = new TwoWayList<>();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        list.display();

        list.deleteFirst();
        list.deleteFirst();

        list.display();

    }
}
