package com.company.iterator;

/**
 * Created by volodyko on 09.05.16.
 */
public interface Iterator {

    void first();
    String next();
    boolean isDone();
    String currentItem();
}
