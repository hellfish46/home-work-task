package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result ;
        result =  java.lang.Integer.toHexString(value).toUpperCase();


        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {
        //"871E18"

//        TODO implements result
        char [] sixteen = new char[value.length()];
        for(int i = 0; i < value.length(); i++){

            sixteen[i] = value.charAt(i);
        }
        //int [] integer = new int [value.length()];
        int x = 0;
        for(int i = 0; i < sixteen.length; i++){
            int temp = 0;
            switch(value.charAt(i)){
                case 'A': temp = 10;
                    break;
                case 'B': temp = 11;
                    break;
                case 'C': temp = 12;
                    break;
                case 'D': temp = 13;
                    break;
                case 'E': temp = 14;
                    break;
                case 'F': temp = 15;
                    break;
            }
            //System.out.println(temp);
            if (temp == 0) {
                temp = Character.getNumericValue(sixteen[i]);

                //System.out.println(temp);
            }
            int c = (int)Math.pow(16, sixteen.length - 1 - i);
            //System.out.println("c = " + c);

            x = x + temp * c;
            // System.out.println(x);

        }


        return x;
    }
}
