package com.company.command;

/**
 * Created by volodyko on 09.05.16.
 */
public class Invoke {
    Command command;

    public void execute(Command command) {
        this.command = command;
        this.command.doCommand();
    }
}
