package javacore.chapter02.condition.exercise;

public class coinChangeV1 {
    public static void main(String[] args) {

        //0, 100,199;
        int totalBill = 41;
        int amountPaid = 100;

        int temp = amountPaid - totalBill;

        if(temp >= 50){
            System.out.println(temp / 50 + " x 50");
            temp -= (temp / 50) * 50;
        }
        if(temp >= 20){
            System.out.println(temp / 20 + " x 20");
            temp -= (temp / 20) * 20;
            System.out.println(temp);
        }
        if(temp >= 10){
            System.out.println(temp / 10 + " x 10");
            temp -= (temp / 10) *10;
        }
        if(temp >= 5){
            System.out.println(temp / 5 + " x 5");
            temp -= (temp / 5) * 5 ;
        }
        if(temp >= 2){
            System.out.println(temp / 2 + " x 2");
            temp -= (temp / 2) *2;
        }
        if(temp >= 1){
            System.out.println(temp + " x 1");
            temp -= (temp / 1) * 1;
            System.out.println(temp);
        }


    }
}
