package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double di = b*b - 4*a*c;


        if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
            return result;
        } else if (di < 0){
            result = "No roots on the set of real numbers!";
            return result;
        } else if (di > 0){
            double xOne = (- 1 * b + Math.sqrt(di)) / (2 * a);
            double xTwo = (-1 * b - Math.sqrt(di)) / (2 * a);
            result = "Discriminant: " + di + ", x1: " + xOne + ", x2: " + xTwo; // Discriminant: 17.0, x1: -0.4384471871911697, x2: -4.561552812808831
            return result;
        } else if (di == 0){
            double xOne = (-1 * b)  / (2 * a);
            System.out.println(xOne);
            result = "Two real, identical roots: [x1 && x2] = " + xOne;
            return result;
        }



        return result;
    }

}
