package com.hillel.lecture_10;

import java.util.Arrays;

public class ProgrammingCalculator extends CalculatorBasic {
    public void sortArray(int[]arrayInt){
        Arrays.sort(arrayInt);

        String arrayToString = Arrays.toString(arrayInt);
        System.out.println(arrayToString);
    }

}
