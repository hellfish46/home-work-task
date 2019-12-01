package com.hillel.lecture_11;

public class User {
    private String name;
    private SendGetMessage sendGetMessage;
    private VoiceMessage voiceMessage;

    public User(String name, SendGetMessage sendGetMessage, VoiceMessage voiceMessage) {
        this.name = name;
        this.sendGetMessage = sendGetMessage;
        this.voiceMessage = voiceMessage;
    }

    public User(String name, SendGetMessage sendGetMessage) {
        this.name = name;
        this.sendGetMessage = sendGetMessage;
    }

    private void functionIsNotSupported(){
        System.out.println("Sorry, but this function isn't supported in current messenger ¯\\_ (ツ) _/¯");
    }

    public void sendMessage(String message){

        sendGetMessage.sendMessage(message);
    };
    public void getMessage(){
        sendGetMessage.getMessage();
    };

    public void getVoiceMessage(){
        if(voiceMessage == null){
            functionIsNotSupported();
            return;
        }
        voiceMessage.getVoiceMessage();
    }
    public void sendVoiceMessage(){
        if(voiceMessage == null){
            functionIsNotSupported();
            return;
        }
        voiceMessage.sendVoiceMessage();
    }
}
