package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.util.Arrays;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        char[] stringChar = new char[value.length()];
        char[] arrayResult = new char[value.length()];
        for (int i = 0; i < stringChar.length; i++){
            stringChar[i]=value.charAt(i);
            arrayResult[arrayResult.length - 1 -i] = stringChar[i];
        }
        result = new String(arrayResult);



        return result;
    }

}
