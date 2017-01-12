package com.company.collection.adts;

import com.company.collection.linkedlist.TwoWayList;

/**
 * Created by volodyko on 10.01.17.
 */
public class Queue<T> {
    private TwoWayList<T> list;

    public Queue() {
        list = new TwoWayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void insert(T j) {
        list.insertLast(j);
    }

    public T remove() {
        return list.deleteFirst();
    }

    public void displayQueue() {
        System.out.println("Queue (front->rear): ");
        list.display();
    }
}
