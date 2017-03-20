package com.company.producerconsumer;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by volodyko on 13.03.17.
 */
public class SyncQueue {
    public static void main(String[] args) {
        final SynchronousQueue<String> queue = new SynchronousQueue<>(true);
        Thread producer = new Thread("PRODUCER") {
            public void run() {
                String event = "FOUR";
                try {
                    queue.put(event);
                    System.out.printf("[%s] published event: %s %n", Thread.currentThread().getName(), event);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        producer.start();

        Thread consumer = new Thread("CONSUMER") {
            public void run() {
                try {
                    String event = queue.take();
                    System.out.printf("[%s] consumed event: %s %n", Thread.currentThread().getName(), event);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        consumer.start();
    }
}
