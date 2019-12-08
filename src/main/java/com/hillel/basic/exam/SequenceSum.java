package com.hillel.basic.exam;

/**
 * Description:
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * which is created by
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input: LastNumber
 * Output: series and result
 * <p>
 * Example:
 * <p>
 * Input: 6
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: -15
 * Output: -15 < 0
 * <p>
 * Input: = 0
 * Output: 0 = 0
 */

public class SequenceSum {

    public static String showSequence(int value) {
        //{ 10, "0+1+2+3+4+5+6+7+8+9+10 = 55"}
        String result ="";
        int[] valueArr = new int[value+1];
        for (int i = 0; i < valueArr.length; i++) {
            valueArr[i] = i;
        }
        int summ = 0;
        for (int j = 0; j < valueArr.length; j++) {
            result = result + j + "+";

            summ = summ + valueArr[j];
        }
        result = result.substring(0, result.length()-1);
        result = result + " = " + summ;
        return result;


    }
}
