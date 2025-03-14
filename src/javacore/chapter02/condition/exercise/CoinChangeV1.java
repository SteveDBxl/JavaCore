package javacore.chapter02.condition.exercise;

public class CoinChangeV1 {
    public static void main(String[] args) {

        //0, 21,52,113;
        int totalBill = 10;
        int amountPaid = 123;

        int stillRemainToGiveBack = amountPaid - totalBill;

        if(stillRemainToGiveBack >= 50){
            System.out.println(stillRemainToGiveBack / 50 + " x 50");
            stillRemainToGiveBack -= (stillRemainToGiveBack / 50) * 50;
        }
        if(stillRemainToGiveBack >= 20){
            System.out.println(stillRemainToGiveBack / 20 + " x 20");
            stillRemainToGiveBack -= (stillRemainToGiveBack / 20) * 20;
            System.out.println(stillRemainToGiveBack);
        }
        if(stillRemainToGiveBack >= 10){
            System.out.println(stillRemainToGiveBack / 10 + " x 10");
            stillRemainToGiveBack -= (stillRemainToGiveBack / 10) *10;
        }
        if(stillRemainToGiveBack >= 5){
            System.out.println(stillRemainToGiveBack / 5 + " x 5");
            stillRemainToGiveBack -= (stillRemainToGiveBack / 5) * 5 ;
        }
        if(stillRemainToGiveBack >= 2){
            System.out.println(stillRemainToGiveBack / 2 + " x 2");
            stillRemainToGiveBack -= (stillRemainToGiveBack / 2) *2;
        }
        if(stillRemainToGiveBack >= 1){
            System.out.println(stillRemainToGiveBack + " x 1");
            stillRemainToGiveBack -= (stillRemainToGiveBack / 1) * 1;
            System.out.println(stillRemainToGiveBack);
        }


    }
}
