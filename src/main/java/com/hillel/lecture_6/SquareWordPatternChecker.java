package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = word;// word, ordw,

        String temp2 = word;


        for (int i = 1; i < word.length(); i++) {
            temp2 = temp2.substring(1) + temp2.charAt(0);
            result = result + ", " + temp2;
        }

        return result;
    }


}
