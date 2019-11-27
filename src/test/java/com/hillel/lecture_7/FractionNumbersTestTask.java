package com.hillel.lecture_7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {
   /* public static void main(String[] args) {
        FractionNumber basicCalculator = new FractionNumber(12.6, 6.0);
        double divide = basicCalculator.divide();
        double multiple = basicCalculator.multiple();
        double minus = basicCalculator.minus();
        double adding = basicCalculator.plus();

        System.out.println(divide);
        System.out.println(multiple);
        System.out.println(minus);
        System.out.println(adding);
        System.out.println(basicCalculator.toString());
        */
   @Test
   public void fractionNumberPlusTest(){
       FractionNumber basicCalculator = new FractionNumber(12.0, 6.0);

       double result = basicCalculator.plus(3.0, 4.2);
       assertEquals(result, 7.2);

   }




    }







