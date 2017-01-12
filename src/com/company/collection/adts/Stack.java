package com.company.collection.adts;

import com.company.collection.linkedlist.LinkList;

/**
 * Created by volodyko on 10.01.17.
 */
public class Stack<T> {
    LinkList<T> list;

    public Stack() {
        list = new LinkList<>();
    }

    public void push(T j) {
        list.insert(j);
    }

    public T pop() {
        return list.getFirst().data;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void displayStack() {
        System.out.println("Stack (top-->bottom): ");
        list.display();
    }
}
