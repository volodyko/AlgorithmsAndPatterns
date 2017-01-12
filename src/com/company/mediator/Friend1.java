package com.company.mediator;

/**
 * Created by volodyko on 10.05.16.
 */
public class Friend1 extends Friend {
    public Friend1(Mediator mediator, String name) {
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
