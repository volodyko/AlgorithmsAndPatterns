package com.company.collection.linkedlist;

/**
 * Created by volodyko on 06.01.17.
 */
public class LinkList<T> {
    private Link<T> first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(T data) {
        Link<T> newLink = new Link<>(data);
        newLink.next = first;
        first = newLink;
    }

    public Link<T> getFirst() {
        Link<T> temp = first;
        return temp;
    }

    public void setFirst(Link<T> first) {
        this.first = first;
    }

    public T find(T object) {
        Link<T> current = first;
        while (current.data != object) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current.data;
    }

    public com.company.collection.linkedlist.ListIterator getIterator() {
        return new com.company.collection.linkedlist.ListIterator(this);
    }

    public T delete(T key) {
        Link<T> current = first;
        Link<T> previus = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                previus = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previus.next = current.next;
        }
        return current.data;
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
}
