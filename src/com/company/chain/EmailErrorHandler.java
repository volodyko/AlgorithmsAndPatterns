package com.company.chain;

/**
 * Created by volodyko on 10.05.16.
 */
public class EmailErrorHandler implements Receiver {
    private Receiver nextReceiver;

    public EmailErrorHandler(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message msg) {
        boolean result = false;
        if (msg.getMsg().contains("Email")) {
            System.out.println("EmailErrorHandler precessed " + msg.getPriority() + " priority issue: " + msg.getMsg());
            result = true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(msg);
            }
        }
        return result;
    }
}
