package com.hillel.lecture_11;

public class Telegram implements SendGetMessage, VoiceMessage {

    private final String MESSANGER = getClass().getSimpleName();
    @Override
    public void sendMessage(String message) {

        System.out.println("User is sending a message by "+ MESSANGER + ": " + message);

    }

    @Override
    public void getMessage() {
        System.out.println("User is getting a message by  "+ MESSANGER);
    }

    @Override
    public void sendVoiceMessage() {
        System.out.println("User is SENDING a voice message by "+ MESSANGER  + ", because it can do it !");
    }

    @Override
    public void getVoiceMessage() {
        System.out.println("User is GETTING a voice message by "+ MESSANGER + ", because it can do it !");
    }

    public Smile defaultSadSmile(){
       return Smile.SAD;
    }

    public Smile defaultJoySmile(){
        return Smile.JOY;
    }

}

