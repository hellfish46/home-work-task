package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = true;
        char[] stringChar = new char[value.length()];
        char[] arrayResult = new char[value.length()];
        for (int i = 0; i < stringChar.length; i++){
            stringChar[i]=value.charAt(i);
            arrayResult[arrayResult.length - 1 -i] = stringChar[i];
        }
        for(int j = 0; j<stringChar.length;j++){
            if (stringChar[j] != arrayResult[j]){
                result = false;
                break;
            }
        }


        return result;
    }

}
