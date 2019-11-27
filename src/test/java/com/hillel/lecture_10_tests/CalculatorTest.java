package com.hillel.lecture_10_tests;


import com.hillel.lecture_10.EngeenerCalculator;
import com.hillel.lecture_10.FinanceCalculator;
import com.hillel.lecture_10.ProgrammingCalculator;

public class CalculatorTest {

    public static void main(String[] args) {
        ProgrammingCalculator progamming = new ProgrammingCalculator();
        int[] array = {13,46,1,12,89,12,12,8,32,78,54,2};
        progamming.sortArray(array);
        progamming.add(12.2,10.0);

        FinanceCalculator finance = new FinanceCalculator();
        finance.getProcent(1000d, 17);

        EngeenerCalculator engeener = new EngeenerCalculator();
        engeener.sqrt(64d);




    }
}
