package com.company.command;

/**
 * Created by volodyko on 09.05.16.
 */
public class CommandMain {
    public static void main(String[] args) {

        Receiver receiver = command -> {
            System.out.println(command.getClass().getSimpleName());
        };

        Invoke invoke = new Invoke();

        UndoCommand undoCommand = new UndoCommand(receiver);
        RedoCommand redoCommand = new RedoCommand(receiver);

        invoke.execute(undoCommand);
        invoke.execute(redoCommand);
    }
}
