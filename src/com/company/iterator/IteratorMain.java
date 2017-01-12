package com.company.iterator;

/**
 * Created by volodyko on 09.05.16.
 */
public class IteratorMain {
    public static void main(String[] args) {
        Subject Sc_subject = new Science();
        Subject Ar_subjects = new Arts();

        Iterator Sc_iterator = Sc_subject.createIterator();
        Iterator Ar_iterator = Ar_subjects.createIterator();

        System.out.println("\nScience subjects :");
        print(Sc_iterator);

        System.out.println("\nArts subjects :");
        print(Ar_iterator);
    }

    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
