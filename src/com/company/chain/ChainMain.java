package com.company.chain;

/**
 * Created by volodyko on 10.05.16.
 */
public class ChainMain {
    public static void main(String[] args) {
        Receiver faxHandler, emailHandler;
        emailHandler = new EmailErrorHandler(null);
        faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.NORMAL);
        Message m2 = new Message("Email is not going", MessagePriority.HIGH);
        Message m3 = new Message("In Email, BCC field is disabled occasionally",
                MessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reaching destination",
                MessagePriority.HIGH);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
