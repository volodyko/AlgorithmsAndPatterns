package com.company.collection.linkedlist;

/**
 * Created by volodyko on 10.01.17.
 */
public class ListIterator<T> {
    private Link<T> current;
    private Link<T> previous;
    private LinkList<T> list;

    public ListIterator(LinkList<T> tLinkList) {
        this.list = tLinkList;
        reset();
    }

    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link<T> getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return current.next == null;
    }

    public boolean insertAfter(T data) {
        Link<T> newLink = new Link<T>(data);
        if (list.isEmpty()) {
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
        return true;
    }

    public boolean insertBefore(T data) {
        Link<T> newLink = new Link<T>(data);
        if (previous == null) {
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
        return true;
    }

    public T deleteCurrent() {
        T value = current.data;
        if (previous == null) {
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
