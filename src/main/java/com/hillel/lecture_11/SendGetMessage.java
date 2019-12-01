package com.hillel.lecture_11;

public interface SendGetMessage {

    public void sendMessage(String message);
    public void getMessage();
    //public String defaultSmile(Smile smile);

    public Smile defaultSadSmile();
    public Smile defaultJoySmile();
}
