package com.company.collection;

/**
 * Created by volodyko on 06.01.17.
 */
public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize + 1;
        queArray = new long[this.maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(long data) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = data;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return rear + 1 == front || front + maxSize - 1 == rear;
    }

    public boolean isFull() {
        return rear + 2 == front || front + maxSize - 2 == rear;
    }

    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return (maxSize - front) + (rear + 1);
        }
    }

    static class Launcher {
        public static void main(String[] args) {
            int size = 5;
            Queue queue = new Queue(size);
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.insert(40);

            queue.remove();
            queue.remove();
            queue.remove();

            queue.insert(50);
            queue.insert(60);
            queue.insert(70);
            queue.insert(80);

            while (!queue.isEmpty()) {
                long n = queue.remove();
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
