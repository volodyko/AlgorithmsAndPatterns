package com.company.mediator;

/**
 * Created by volodyko on 10.05.16.
 */
public class Boss extends Friend {

    public Boss(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String msg) {
        mediator.send(this, msg);
    }

    public void notify(String msg) {
        System.out.println(name + " gets message: " + msg);
    }
}
