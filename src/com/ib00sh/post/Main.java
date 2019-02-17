package com.ib00sh.post;

public class Main {
    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox(3);
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");
        messageBox.add(Message.MessageCategory.REGULAR, "Павлов П. И." , "На деревню дедушке", "Павлов С. Е.");

        System.out.println(messageBox);
    }
}
