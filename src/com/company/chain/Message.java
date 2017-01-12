package com.company.chain;

/**
 * Created by volodyko on 10.05.16.
 */
public class Message {
    private final String msg;
    private MessagePriority priority;

    public Message(String msg, MessagePriority priority) {
        this.msg = msg;
        this.priority = priority;
    }

    public String getMsg() {
        return msg;
    }

    public MessagePriority getPriority() {
        return priority;
    }
}
