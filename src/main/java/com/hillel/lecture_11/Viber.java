package com.hillel.lecture_11;

public class Viber implements SendGetMessage {


    private final String MESSANGER = getClass().getSimpleName();

    @Override
    public void sendMessage(String message) {
        System.out.println("User is sending a message by "+ MESSANGER + ": " + message);
    }

    @Override
    public void getMessage() {
        System.out.println("User is getting a message by "+ MESSANGER);
    }

    public Smile defaultSadSmile(){
        return Smile.SAD;
    }

    public Smile defaultJoySmile(){
        return Smile.JOY;
    }
}
