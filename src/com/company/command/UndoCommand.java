package com.company.command;

/**
 * Created by volodyko on 09.05.16.
 */
public class UndoCommand implements Command {

    private Receiver receiver;

    public UndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doCommand() {
        receiver.performCommand(this);
    }
}
