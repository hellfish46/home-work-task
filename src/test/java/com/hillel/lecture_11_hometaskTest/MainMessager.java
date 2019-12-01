package com.hillel.lecture_11_hometaskTest;

import com.hillel.lecture_11.Smile;
import com.hillel.lecture_11.Telegram;
import com.hillel.lecture_11.User;
import com.hillel.lecture_11.Viber;

public class MainMessager {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Viber viber = new Viber();

        User userWithTelegram = new User("Anton",telegram,telegram);
        userWithTelegram.sendMessage("Hello, I've got your gift, thank you " + telegram.defaultJoySmile().getThirdSmile());
        userWithTelegram.sendMessage("...but I can't open it! It's very difficult " + telegram.defaultSadSmile().getSecondSmile());
        userWithTelegram.sendMessage("Wait a minute, I'll send you voice message...");
        userWithTelegram.sendVoiceMessage();
        userWithTelegram.getVoiceMessage();
        System.out.println();
        User userWithViber = new User("Yurii", viber);
        userWithViber.sendMessage("Hello, Max ! I've downloaded Viber to try test voice message..." + viber.defaultSadSmile().getSecondSmile());
        userWithViber.sendVoiceMessage();
        userWithViber.sendMessage("Shit...it said, that it wasn't supported here... I should download Telegram and delete this shitty Viber" + viber.defaultSadSmile().getFirstSmile());







    }
}
