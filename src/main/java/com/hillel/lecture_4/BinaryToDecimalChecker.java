package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int x = value;
        String resultInString = "";
        System.out.println(x%2);

        while(x != 1){
            int ostatok = x%2;
            x = Math.floorDiv(x , 2);

            resultInString = resultInString + ostatok ;
            System.out.println("x = " + x + ", ост = " + ostatok);

        }
        resultInString =  resultInString + x;
        System.out.println(resultInString);
        StringBuffer buffer = new StringBuffer(resultInString);
        resultInString = buffer.reverse().toString();
       // System.out.println(buffer);
        result = Integer.parseInt(resultInString);







        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        String valueString = "" + value;
        result = Integer.parseInt(valueString, 2);

        return result;
    }
}
