package com.company.collection.linkedlist;

/**
 * Created by volodyko on 06.01.17.
 */
public class Launcher {
    public static void main(String[] args) {
        LinkList<Integer> linkedList = new LinkList<>();
        linkedList.insert(22);
        linkedList.insert(44);
        linkedList.insert(66);
        linkedList.insert(88);

        linkedList.display();
        Integer find = linkedList.find(44);
        if (find != null) {
            System.out.println("Found: " + find);
        }
        Integer data = linkedList.delete(44);
        if (data != null) {
            System.out.println("Deleted " + data);
        }

        linkedList.display();
    }
}
