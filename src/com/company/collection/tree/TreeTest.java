package com.company.collection.tree;

import com.company.collection.sorts.simple.BinarySearch;

/**
 * Created by volodyko on 05.01.17.
 */
public class TreeTest {

    static int[] mas = new int[50];

    public static void main(String[] args) {

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * -1;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ",");
        }
        System.out.println();
        BinarySearch binarySearch = new BinarySearch(mas);
        long start = System.currentTimeMillis();
        System.out.println(binarySearch.find(34));
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration: " + duration);

        HashTree tree = new HashTree();

        tree.add("B");
        tree.add("A");
        tree.add("E");
        tree.add("C");
        tree.add("F");
        tree.add("D");
        tree.traverse(HashTree.PREORDER, data -> {
            System.out.println(data);
        });

        System.out.print(tree);
    }


}
