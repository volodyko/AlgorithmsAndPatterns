package com.company.threading;

import java.util.Scanner;

/**
 * Created by volodyko on 13.05.16.
 */

public class ThreadingMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Shut " + System.currentTimeMillis());
        processor.setShutDown();
    }
}

class Processor extends Thread {

    private volatile boolean shutDown = true;

    @Override
    public void run() {
        while (shutDown) {
            System.out.println(System.currentTimeMillis());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setShutDown() {
        shutDown = false;
    }
}
