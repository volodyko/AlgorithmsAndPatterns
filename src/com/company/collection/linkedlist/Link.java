package com.company.collection.linkedlist;

/**
 * Created by volodyko on 06.01.17.
 */
public class Link<T> {
    public T data;
    public Link<T> next;
    public Link<T> pervious;
    
    public Link(T data) {
        this.data = data;
    }

    public void display() {
        System.out.print(data.toString() + " ");
    }
}
