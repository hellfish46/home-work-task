package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public double linearEquation(int a, int b) {
        // Написать программу, которая бы решала уравнение вида a x + b = 0 * Переменные a и b можно задать вручную.
        // Далее нужно будет посчитать и вывести * значение “х”. Программа должна также учитывать варианты, когда или а = 0 или b = 0
//        TODO implements result
        double result = 0.0;

        //  int isANull = (int) Math.signum(a);
        //  int isBNull = (int) Math.signum(b);
        if (a == 0){
            result = 0.0;
        } else if (b == 0){
            result = 0/2;
        } else {
            result = -b/a;
        }












        return result;
    }
}
