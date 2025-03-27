package javacore.chapter02.condition.exercise;

public class CoinChangeV1 {
    public static void main(String[] args) {

        //0, 21,52,113;
        int totalBill =10;
        int amountPaid =257;

        //ce sont les valeurs
        int fifty = 50;
        int twenty = 20;
        int ten =10;
        int five = 5;
        int two = 2;
        int one =1;

        int stillRemainToGiveBack = amountPaid - totalBill;

        int remainOnFifty = stillRemainToGiveBack / fifty;

       /* if(stillRemainToGiveBack >= fifty){
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
        }*/
        if(stillRemainToGiveBack >= fifty){
            System.out.println(remainOnFifty + " x " +fifty);
            stillRemainToGiveBack -= remainOnFifty * fifty;
        }
        if(stillRemainToGiveBack >= twenty){
            int remainOnTwenty = stillRemainToGiveBack / twenty;
            System.out.println(remainOnTwenty + " x " + twenty);
            stillRemainToGiveBack -= remainOnTwenty * twenty;
        }
        if(stillRemainToGiveBack >= ten){
            int remainOnTen = stillRemainToGiveBack / ten;
            System.out.println(stillRemainToGiveBack /ten  + " x "+ ten);
            stillRemainToGiveBack -= remainOnTen * ten;
        }
        if(stillRemainToGiveBack >= five){
            int remainOnFive = stillRemainToGiveBack / five;
            System.out.println(remainOnFive + " x " + five);
            stillRemainToGiveBack -= remainOnFive * five ;
        }
        if(stillRemainToGiveBack >= two){
            int remainOnTwo = stillRemainToGiveBack / two;
            System.out.println(remainOnTwo + " x " + two);
            stillRemainToGiveBack -= remainOnTwo * two;
        }
        if(stillRemainToGiveBack >= one){
            int remainOnOne = stillRemainToGiveBack / one;
            System.out.println(remainOnOne + " x " + one);
            stillRemainToGiveBack -= remainOnOne *one;
        }

    }
}
