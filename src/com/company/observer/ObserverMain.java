package com.company.observer;

/**
 * Created by volodyko on 03.05.16.
 */
public class ObserverMain {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        ObserverImpl observerImpl1 = new ObserverImpl();
        subject.register(observerImpl1);
        System.out.println("Setting flag = 5");
        subject.setFlag(5);
        System.out.println("Setting flag = 25");
        subject.setFlag(25);
        subject.unregister(observerImpl1);
        System.out.println("Setting flag = 50");
        subject.setFlag(50);
    }
}
