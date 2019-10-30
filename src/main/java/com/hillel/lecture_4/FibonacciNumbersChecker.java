package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        //int[] result = { };
        int[] maxLength = new int[number];
        int tempOne = 0;
        int tempTwo = 0;
        int x;

        if(number >= 2){
            maxLength[0] = 0;
            maxLength[1] = 1;
            maxLength[2] = 1;
            tempOne = 1;
            tempTwo =1;
        }
        int arrayCounter = 0;
       for(int i = 3 ; i < number; i++){
           x = tempOne + tempTwo;
           if(x>number){
            //   System.out.println(number);
               arrayCounter = i;

               break;
           }
           maxLength[i] = x;
           tempOne = tempTwo;
           tempTwo = x;
           //System.out.println("Итерация: "+ i + " число: " + x );
       }
       int [] normalArr = new int [arrayCounter];
       for(int i = 0; i < arrayCounter; i++){
           normalArr[i] = maxLength[i];
       }
       maxLength = null;
        //System.out.println(normalArr.length);







        return normalArr;
    }

}
