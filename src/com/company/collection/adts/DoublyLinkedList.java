package com.company.collection.adts;

import com.company.collection.linkedlist.Link;

/**
 * Created by volodyko on 10.01.17.
 */
public class DoublyLinkedList {
    private Link<Long> first;
    private Link<Long> last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Link<Long> newLink = new Link<>(dd);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.pervious = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        Link<Long> newLink = new Link<>(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.pervious = last;
        }
        last = newLink;
    }

    public long deleteFirst() {
        Link<Long> temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.pervious = null;
            first = first.next;
        }
        return temp.data;
    }

    public long deleteLast() {
        Link<Long> temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.pervious.next = null;
        }
        last = last.pervious;
        return temp.data;
    }

    public boolean insertAfter(long key, long dd) {
        if (isEmpty()) {
            return false;
        }
        Link<Long> current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Link<Long> newLink = new Link<>(dd);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.pervious = newLink;
        }
        newLink.pervious = current;
        current.next = newLink;
        return true;
    }

    public long deleteKey(long key) {
        Link<Long> current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return -1;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.pervious.next = current.next;
        }
        if (current == last) {
            last = current.pervious;
        } else {
            current.next.pervious = current.pervious;
        }
        return current.data;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last;
        while (current != null) {
            current.display();
            current = current.pervious; // Переход к следующему элементу
        }
        System.out.println("");
    }
}
