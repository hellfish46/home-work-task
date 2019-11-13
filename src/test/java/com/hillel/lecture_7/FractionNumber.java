package com.hillel.lecture_7;

/**
 * Created by alpa on 11/8/19
 */
public class FractionNumber {
    private double firstNumber;
    private double secondNumber;
    // getters and setters
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    // custom constructor
    public FractionNumber(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    // basic constructor
    public FractionNumber(){

    }
    // activities
    public double plus(){
        return this.firstNumber + this.secondNumber;
    };
    public double minus(){
        return this.firstNumber - this.secondNumber;
    }
    public double multiple(){
        return this.firstNumber * this.secondNumber;
    }
    public double divide(){
        return this.firstNumber / this.secondNumber;
    }

    @Override
    public String toString() {
        return "You can see, that this object contains: firstNumber=" + firstNumber +
                " and, secondNumber=" + secondNumber + ". P.S. Have a nice day !";
    }


}
