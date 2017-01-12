package com.company.chain;

/**
 * Created by volodyko on 10.05.16.
 */
public interface Receiver {
    boolean processMessage(Message msg);
}
