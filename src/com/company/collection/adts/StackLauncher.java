package com.company.collection.adts;

/**
 * Created by volodyko on 10.01.17.
 */
public class StackLauncher {
    public static void main(String[] args) {
        Stack<Long> stack = new Stack<>();
        stack.push(20L);
        stack.push(40L);

        stack.displayStack();
        stack.push(60L);
        stack.push(80L);

        stack.displayStack();

        stack.pop();
        stack.pop();

        stack.displayStack();

    }
}
