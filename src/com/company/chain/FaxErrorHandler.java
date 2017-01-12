package com.company.chain;

/**
 * Created by volodyko on 10.05.16.
 */
public class FaxErrorHandler implements Receiver {
    private Receiver nextReceiver;

    public FaxErrorHandler(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message msg) {
        boolean result = false;
        if (msg.getMsg().contains("Fax")) {
            System.out.println("FaxErrorHandler precessed " + msg.getPriority() + " priority issue: " + msg.getMsg());
            result = true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(msg);
            }
        }
        return result;
    }
}
