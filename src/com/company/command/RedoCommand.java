package com.company.command;

/**
 * Created by volodyko on 09.05.16.
 */
public class RedoCommand implements Command {
    private Receiver receiver;

    public RedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doCommand() {
        receiver.performCommand(this);
    }
}
