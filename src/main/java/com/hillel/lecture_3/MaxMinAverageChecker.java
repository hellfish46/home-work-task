package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && b == c) {
            return result;
        }
        int max1 = Math.max(a,b);
        result = Math.max(c, max1);

        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        int max = getMaxNumber(a, b, c);
        int min = getMinNumber(a, b, c);
        if (max == 0){
            return result;
        }
        if (a != max && a != min){
            result = a;
        } else if (b != max && b != min){
            result = b;
        } else if (c != max && c != min){
            result = c;
        }




        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && b == c){
            return result;
        }
        int min1 = Math.min(a,b);
        result = Math.min(c, min1);

        return result;
    }
}
