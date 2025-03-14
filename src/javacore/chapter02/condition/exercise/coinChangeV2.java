package javacore.chapter02.condition.exercise;

public class coinChangeV2 {
    public static void main(String[] args) {

        //0, 100,199;
        int totalBill = 41;
        int amountPaid = 100;
        int nb50 = 8;
        int nb20 = 2;
        int nb10 = 3;
        int nb5 = 2;
        int nb2 = 2;
        int nb1 = 1;

        int temp = amountPaid - totalBill;
        if(temp >= 50){
            if(temp /50 <= nb50) {
                System.out.println(temp / 50 + " x 50");
                temp -= (temp / 50) * 50;

            }
        }
        if(temp >= 20){
            if(temp/20 <= nb20){
                System.out.println(temp / 20 + " x 20");
                temp -= (temp / 20) * 20;
            }

        }
        if(temp >= 10){
            if(temp/10 <= nb10){
                System.out.println(temp / 10 + " x 10");
                temp -= (temp / 10) * 10;
            }

        }
        if(temp >= 5){
            if(temp/5 <= nb5){
                System.out.println(temp / 5 + " x 5");
                temp -= (temp / 5) * 5;
            }

        }
        if(temp >= 2){
            if(temp/2 <= nb2){
                System.out.println(temp / 2 + " x 2");
                temp -= (temp / 2) * 2;
            }

        }
        if(temp >= 1){
            if(temp/1 <= nb1){
                System.out.println(temp / 1 + " x 1");
                temp -= (temp / 1) * 1;
            }

        }


    }
}
