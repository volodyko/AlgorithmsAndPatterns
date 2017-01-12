package com.company.collection.adts;

import com.company.collection.linkedlist.Link;

/**
 * Created by volodyko on 10.01.17.
 */
public class SortedList {
    private Link<Long> first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(long key) {
        Link<Long> newLint = new Link<>(key);
        Link<Long> previous = null;
        Link<Long> current = first;

        while (current != null && key > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLint;
        } else {
            previous.next = newLint;
        }
        newLint.next = current;
    }

    public long remove() {
        Link<Long> tem = first;
        first = first.next;
        return tem.data;
    }


    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;

        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }
}
