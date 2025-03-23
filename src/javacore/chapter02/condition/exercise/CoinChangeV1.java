package javacore.chapter02.condition.exercise;

public class CoinChangeV1 {
    public static void main(String[] args) {

        //0, 21,52,113;
        int totalBill =10;
        int amountPaid =123;
        int billet50 = 50;
        int billet20 = 20;
        int billet10 =10;
        int billet5 = 5;
        int piece2 = 2;
        int piece1 =1;

        int fifty = 50;
        int twenty = 20;
        int ten =10;
        int five = 5;
        int two = 2;
        int one =1;

        int stillRemainToGiveBack = amountPaid - totalBill;

        int remainOnFifty = stillRemainToGiveBack/fifty;
        int remainOnTwenty = stillRemainToGiveBack/twenty;
        int remainOnTen = stillRemainToGiveBack/ten;
        int remainOnFive = stillRemainToGiveBack/five;
        int remainOnTwo = stillRemainToGiveBack/two;
        int remainOnOne = stillRemainToGiveBack/one;

        if(stillRemainToGiveBack >= fifty){
            System.out.println(remainOnFifty + " x " +fifty);
            stillRemainToGiveBack -= remainOnFifty * fifty;
            remainOnTwenty = stillRemainToGiveBack/twenty;
        }


        if(stillRemainToGiveBack >= twenty){
            System.out.println(remainOnTwenty + " x " + twenty);
            stillRemainToGiveBack -= remainOnTwenty * twenty;
            remainOnTen = stillRemainToGiveBack/ten;

        }
        if(stillRemainToGiveBack >= ten){
            System.out.println(remainOnTen + " x "+ ten);
            stillRemainToGiveBack -= remainOnTen * ten;
            remainOnFive = stillRemainToGiveBack/five;
        }
        if(stillRemainToGiveBack >= five){
            System.out.println(remainOnFive + " x " + five);
            stillRemainToGiveBack -= remainOnFive * five ;
            remainOnTwo = stillRemainToGiveBack/two;
        }
        if(stillRemainToGiveBack >= two){
            System.out.println(remainOnTwo + " x " + two);
            stillRemainToGiveBack -= remainOnTwo * two;
            remainOnOne = stillRemainToGiveBack/one;
        }
        if(stillRemainToGiveBack >= one){
            System.out.println(remainOnOne + " x " + one);
            stillRemainToGiveBack -= remainOnOne *one;
        }
    }
}
