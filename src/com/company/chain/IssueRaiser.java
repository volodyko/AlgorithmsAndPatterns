package com.company.chain;

/**
 * Created by volodyko on 10.05.16.
 */
public class IssueRaiser {
    private Receiver setFirstReceiver;

    public IssueRaiser(Receiver setFirstReceiver) {
        this.setFirstReceiver = setFirstReceiver;
    }

    public void raiseMessage(Message msg) {
        if (setFirstReceiver != null) {
            setFirstReceiver.processMessage(msg);
        }
    }
}
