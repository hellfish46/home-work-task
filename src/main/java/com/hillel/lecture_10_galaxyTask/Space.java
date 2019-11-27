package com.hillel.lecture_10_galaxyTask;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public abstract class Space {
    public void getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    };


    public abstract void SayHiFromClass();



}
