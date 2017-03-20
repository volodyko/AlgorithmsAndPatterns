package com.company.producerconsumer;

import java.util.Vector;

/**
 * Created by volodyko on 13.03.17.
 */
public class WaitNotify {
    public static void main(String[] args) {
        Vector sharedQueue = new Vector();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "PRODUCER");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "CONSUMER");
        prodThread.start();
        consThread.start();
    }
}

class Producer implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public Producer(Vector sharedQueue, int SIZE) {
        this.sharedQueue = sharedQueue;
        this.SIZE = SIZE;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Produced: " + i);

            try {
                produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce(int i) throws InterruptedException {
        while (sharedQueue.size() == SIZE) {
            synchronized (sharedQueue) {
                System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting, size: " + sharedQueue.size());
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }


}

class Consumer implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public Consumer(Vector sharedQueue, int SIZE) {
        this.sharedQueue = sharedQueue;
        this.SIZE = SIZE;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private int consume() throws InterruptedException {
        //wait if queue is empty
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }

        //Otherwise consume element and notify waiting producer
        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}
