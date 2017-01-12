package com.company.collection.adts;

/**
 * Created by volodyko on 10.01.17.
 */
public class QueueLauncher {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.insert(20);
        queue.insert(40);
        queue.displayQueue();

        queue.insert(60);
        queue.insert(80);
        queue.displayQueue();

        queue.remove();
        queue.remove();

        queue.displayQueue();
    }
}
