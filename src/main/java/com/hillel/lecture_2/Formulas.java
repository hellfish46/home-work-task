package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
       // double result = 0.0;
        double result = 1.1 * Math.exp(-1 * x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) + (3.0/8.0);
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 0.0;
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 0.0;
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = 0.0;
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13
        return result;
    }
}
