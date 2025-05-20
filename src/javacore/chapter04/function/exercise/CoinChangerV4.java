package javacore.chapter04.function.exercise;

import java.util.Scanner;

public class CoinChangerV4 {
    //verifie si il reste
    static boolean verifStillRemain(int remainToGiveBack, int amount){
    if(remainToGiveBack / amount > 0){
        return true;
    }
    return false;
    }
    //denomination représente les != coupures, maxOfDenomination représente combien d'exemplaire de cette coupure
    static int howManyDenomination(int denomination, int maxOfDenomination, int remainToGiveBack){
        for(int count = 1; count <= maxOfDenomination && count * denomination < remainToGiveBack; count++){}

        return 1;
    }
    //renvoie le nouveau montant restant à rendre après avoir rendu la coupure désirée
    static int giveBack(int remainToGiveBack, int typeOfGiveBack, int stockOfGivingBack){
        return remainToGiveBack - typeOfGiveBack * stockOfGivingBack;
    }

    static int haveEnoughCashToReturn(int stockFifty, int stockTwenty, int stockTen, int stockFive, int stockTwo, int stockOne){
        return (stockFifty * 50) + (stockTwenty * 20) + (stockTen * 10) + (stockFive * 5) + (stockTwo * 2) + (stockOne * 1);
    }

    static boolean haveEnoughDenomination(int remainToGiveBack, int denomination, int stillRemainOn, int amountOnRemain ){
        if(remainToGiveBack >= denomination && stillRemainOn <= amountOnRemain && amountOnRemain > 0)
        return true;

        return false;
    }
    public static void main(String[] args){

                //0, 28, 15 ,51, 100;
                int totalBill = 10;
                int amountPaid = 123;
                int amount50Remain = 1;
                int amount20Remain = 5;
                int amount10Remain = 4;
                int amount5Remain = 2;
                int amount2Remain = 2;
                int amount1Remain = 1;
                int stillRemainToGiveBack = amountPaid - totalBill;

                System.out.println("Nous devons vous rendre : " + stillRemainToGiveBack + "€");
                Scanner input = new Scanner(System.in);
                System.out.println( "Combien de billet de 50 voulez vous?");
                int billet50Desirer = input.nextInt();

                int billet20Desirer = 0;
                int billet10Desirer = 0;
                int billet5Desirer = 0;
                int piece2Desirer = 0;
                int piece1Desirer = 0;

                boolean ok50 = amount50Remain >= billet50Desirer;
                boolean ok20 = true;
                boolean ok10 = true;
                boolean ok5 = true;
                boolean ok2 = true;
                boolean ok1 = true;

                if(haveEnoughCashToReturn(amount50Remain, amount20Remain, amount10Remain, amount5Remain, amount2Remain, amount1Remain) < totalBill){
                    System.out.println("montant insuffisant!!!");
                    return;
                }
                if(verifStillRemain(stillRemainToGiveBack, 50)) {
                    System.out.println("Combien de billet de 20 voulez vous?");
                    billet20Desirer = input.nextInt();
                    ok20 = amount20Remain >= billet20Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack, 20)) {
                    System.out.println("Combien de billet de 10 voulez vous?");
                    billet10Desirer = input.nextInt();
                    ok10 = amount10Remain >= billet10Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack, 10)) {
                    System.out.println("Combien de billet de 5 voulez vous?");
                    billet5Desirer = input.nextInt();
                    ok5 = amount5Remain >= billet5Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack,5)) {
                    System.out.println("Combien de pièce de 2 voulez vous?");
                    piece2Desirer = input.nextInt();
                    ok2 = amount2Remain >= piece2Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack,2)) {
                    System.out.println("Combien de pièce de 1 voulez vous?");
                    piece1Desirer = input.nextInt();
                    ok1 = amount1Remain >= piece1Desirer;
                }

                    int stillRemainOn50 = stillRemainToGiveBack / 50;
                    if (haveEnoughDenomination(stillRemainToGiveBack,  50,  stillRemainOn50,  amount50Remain)) {
                        System.out.println(stillRemainOn50 + " x 50");
                        stillRemainToGiveBack -= (stillRemainOn50) * 50;
                    }
                    int stillRemainOn20 = stillRemainToGiveBack / 20;
                    if (haveEnoughDenomination(stillRemainToGiveBack, 20, stillRemainOn20, amount20Remain)) {
                        System.out.println(stillRemainOn20 + " x 20");
                        stillRemainToGiveBack -= (stillRemainOn20) * 20;
                    }
                    int stillRemainOn10 = stillRemainToGiveBack / 10;
                    if (haveEnoughDenomination(stillRemainToGiveBack,  10, stillRemainOn10,  amount10Remain)) {
                        System.out.println(stillRemainOn10 + " x 10");
                        stillRemainToGiveBack -= (stillRemainOn10) * 10;
                    }
                    int stillRemainOn5 = stillRemainToGiveBack / 5;
                    if (haveEnoughDenomination(stillRemainToGiveBack,  5, stillRemainOn5,  amount5Remain)) {
                        System.out.println(stillRemainOn5 + " x 5");
                        stillRemainToGiveBack -= (stillRemainOn5) * 5;
                    }
                    int stillRemainOn2 = stillRemainToGiveBack / 2;
                    if (haveEnoughDenomination(stillRemainToGiveBack,2,stillRemainOn2,  amount2Remain)) {
                        System.out.println(stillRemainOn2 + " x 2");
                        stillRemainToGiveBack -= (stillRemainOn2) * 2;
                    }
                    int stillRemainOn1 = stillRemainToGiveBack / 1;
                    if (haveEnoughDenomination(stillRemainToGiveBack,1,stillRemainOn1, amount1Remain)) {
                        System.out.println(stillRemainOn1 + " x 1");
                        stillRemainToGiveBack -= (stillRemainOn1) * 1;
                    }




            }
        }
