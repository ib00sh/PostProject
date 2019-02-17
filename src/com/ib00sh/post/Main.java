package com.ib00sh.post;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox(3);
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");

        System.out.println(messageBox);

        System.out.println();
        System.out.println();
        System.out.println();

        Message m = messageBox.search(2);
        m.setCategory(Message.MessageCategory.FIRST_CLASS);

        System.out.println(messageBox);

        System.out.println();
        System.out.println();
        System.out.println();

        boolean d =  messageBox.delete(1);
        System.out.println("d = " + d);
        System.out.println(messageBox);

        System.out.println();
        System.out.println();
        System.out.println();

        List<Message> list = messageBox.list();
        for (Message message: list) {
            System.out.println("MESSAGE: " + message);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        List<Long> ids = messageBox.sendToMailOffice();
        System.out.println(ids);
        System.out.println(messageBox);

    }
}
