package com.company.collection.tree.adt;

/**
 * Created by volodyko on 12.01.17.
 */
public class Node {
    int iData;
    double fData;
    Node leftChild;
    Node rightChild;

    public Node() {
    }

    public Node(int iData, double fData) {
        this.iData = iData;
        this.fData = fData;
    }

    public void displayNode() {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(fData);
        System.out.print("} ");
    }
}
