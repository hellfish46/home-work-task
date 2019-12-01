package com.hillel.lecture_11;

public enum Smile {
    JOY(":)", ";)", ":D"),
    SAD(":(",":/","=(");
   // EXTRA("¯\_ (ツ) _/¯");

    private String firstSmile;
    private String secondSmile;
    private String thirdSmile;
    Smile(String firstSmile, String secondSmile, String thirdSmile){
        this.firstSmile = firstSmile;
        this.secondSmile = secondSmile;
        this.thirdSmile = thirdSmile;
    }

    public String getFirstSmile(){
        return firstSmile;
    };
    public String getSecondSmile(){
        return secondSmile;
    };
    public String getThirdSmile(){
        return thirdSmile;
    }


}
