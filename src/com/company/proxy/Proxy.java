package com.company.proxy;


/**
 * Created by volodyko on 05.05.16.
 */
public class Proxy extends Subject {
    ConcreteSubject concreteSubject;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call doSomeWork()");
        //LazyInitialization
        if (concreteSubject == null) {
            System.out.println("concrete subject created");
            concreteSubject = new ConcreteSubject();
        }
        concreteSubject.doSomeWork();
    }
}
