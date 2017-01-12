package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by volodyko on 26.12.16.
 */
public class Collection {
    private static List arrayList;
    private static List copyOnWriteArrayList;

    public static void main(String[] args) {
        init();
        
    }

    private static void init() {
        arrayList = new ArrayList(100);
        arrayList = Collections.synchronizedList(arrayList);
        copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
            copyOnWriteArrayList.add(i);
        }
    }

}
