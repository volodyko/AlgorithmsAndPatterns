package com.company.collection.tree.adt;

/**
 * Created by volodyko on 14.01.17.
 */
public class TreeLauncher {


    public static void main(String[] args) {
        int value;
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);


        theTree.traverse(1);
        theTree.traverse(2);
        theTree.traverse(3);

    }
}
