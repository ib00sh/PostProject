package com.ib00sh.post;

public class MessageBox {
    private Message[] messages;
    private int current;
    private static long nextIndex;

    public MessageBox(int count) {
        messages = new Message[count];
        current = 0;

    }

    public long add(Message.MessageCategory category, String sender, String address, String receiver){
        Message message = new Message(category, sender, address, receiver);
        message.setId(nextIndex++);
        messages[current] = message;
        current++;
        return message.getId();
    }
}
