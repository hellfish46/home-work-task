package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
        String trimmed = sentence.trim();
        String pointDeleted = trimmed.replace(".", "");
        String komaDeleted = pointDeleted.replace(",", "");
        String [] arrayString = komaDeleted.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            if(arrayString[i].length() == wordLength){
                result++;
            }
        }











        return result;
    }


}
