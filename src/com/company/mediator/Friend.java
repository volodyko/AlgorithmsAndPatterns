package com.company.mediator;

/**
 * Created by volodyko on 10.05.16.
 */
public class Friend {
    public String name;
    protected Mediator mediator;

    public Friend(Mediator mediator) {
        this.mediator = mediator;
    }
}
