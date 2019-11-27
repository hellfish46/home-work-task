package com.hillel.lecture_10;

public class FinanceCalculator extends CalculatorBasic {
    public void getProcent(Double startNumber, int procentOfNumber){
        double result = startNumber*procentOfNumber/100;
        System.out.println(result);
    }


}
