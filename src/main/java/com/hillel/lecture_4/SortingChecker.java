package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[values.length];

        for(int j = 0; j < result.length; j++){
            result[j]=values[j];
        }
        int count;
        do {
            count = 0;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    int temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);

        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[values.length];

        for(int j = 0; j < result.length; j++){
            result[j]=values[j];
        }
        int count;
        do {
            count = 0;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] < result[i + 1]) {
                    int temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);

        return result;
    }
}
