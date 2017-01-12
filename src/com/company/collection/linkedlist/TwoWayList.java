package com.company.collection.linkedlist;

/**
 * Created by volodyko on 10.01.17.
 */
public class TwoWayList<T> extends LinkList<T> {
    private Link<T> first;
    private Link<T> last;


    public TwoWayList() {
        this.first = null;
        this.last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(T data) {
        Link<T> newLink = new Link<>(data);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(T data) {
        Link<T> newLink = new Link<T>(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public void display() {
        System.out.println("List (first-->last)");
        Link<T> current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    public T deleteFirst() {
        Link<T> temp = first;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp.data;
    }
}
