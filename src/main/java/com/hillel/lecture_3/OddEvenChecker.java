package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {

    @Step
    public String checkNumber(int number) {

//        TODO implements result

        System.out.println("BYE");
        if(number%2 == 0){
            String result = "Even Number";
            return result;
        } else  {
            String result = "Odd Number";
            return result;
        }

    }
}
