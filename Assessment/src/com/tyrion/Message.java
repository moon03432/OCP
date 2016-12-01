package com.tyrion;

/**
 * Created by moon on 20/10/2016.
 */
public abstract class Message {
    public String recipient;
    public abstract void sendMessage();

//    public static void main(String[] args) {
//        Message m = new TextMessage();
//        m.recipient = "1234567890";
//        m.sendMessage();
//    }

    static class TextMessage extends Message {
        public final void sendMessage() {
            System.out.println("Text message to " + recipient);
        }
    }
}
