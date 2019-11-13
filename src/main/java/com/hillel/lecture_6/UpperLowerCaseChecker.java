package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String[] arrayString = sentence.split("\\."); // разбил строку на массив по разделителю ТОЧКА
        System.out.println(arrayString.length);
        for (int i = 0; i < arrayString.length; i++) { //создал цикл, каждый элемент массива - 1 предложение
            arrayString[i] = arrayString[i].trim(); // обрезал пробелы с начала предложения и в конце
            // Беру 1ю букву 1го элемента массив (1 предложение) и делаю букву заглавной. + прибавляю остаток предложения
            arrayString[i] = arrayString[i].substring(0,1).toUpperCase() + arrayString[i].substring(1);
           //2й цикл сделает тоже только со вторым предложением
        }
        result = String.join(". ", arrayString);// Склеиваю массив в 1 строку с разделителем ". "
        // условие - если в исходная строка заканчивалась точкой - то добавить точку в наш результат
        if(sentence.charAt(sentence.length()-1) == '.'){

            result = result + ".";
        }
        result = result.trim();// обрезаю в нашем результате пробелы (если они есть)


        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {
       String result = "";
        String[] arrayString = sentence.split(" ");

        for (int i = 0; i < arrayString.length; i++) {
            //arrayString[i] = arrayString[i].fi
            arrayString[i] = arrayString[i].substring(0,1).toUpperCase() + arrayString[i].substring(1);
            System.out.println( i + " " + arrayString[i]);
            result = result + " " + arrayString[i];



        }
        //String result = arrayString.toString();
        result = result.trim();


        return result;


    }
}
