package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;
        String[] stringArr = code.split(" ");
        String isThereLowerCase = stringArr[0].toUpperCase();
        if (!stringArr[0].equals(isThereLowerCase)){
            return isValid;
        }
        String onlyNumbers = stringArr[0].replaceAll("\\D+","");
        int first = Integer.parseInt("" + onlyNumbers.charAt(0)+onlyNumbers.charAt(1));
        int second = Integer.parseInt("" + onlyNumbers.charAt(2)+onlyNumbers.charAt(3));
        int third = Integer.parseInt("" + onlyNumbers.charAt(4)+onlyNumbers.charAt(5));
        int result = first * second * third;
        int codeInt = Integer.parseInt(stringArr[1]);
        if (result == codeInt){
            isValid = true;
        }



        return isValid;
    }
}
