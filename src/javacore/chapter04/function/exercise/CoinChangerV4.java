package javacore.chapter04.function.exercise;

import java.util.Scanner;

public class CoinChangerV4 {

    static final int VALUEOF50 = 50;
    static final int VALUEOF20 = 20;
    static final int VALUEOF10 = 10;
    static final int VALUEOF5 = 5;
    static final int VALUEOF2 = 2;
    static final int VALUEOF1 = 1;


    //verifie si il reste
    static boolean verifStillRemain(int remainToGiveBack, int amount) {
        return (remainToGiveBack / amount) > 0 ? true : false;
    }

    //renvoie le nouveau montant restant à rendre après avoir rendu la coupure désirée
    static int giveBack(int remainToGiveBack, int typeOfGiveBack, int stockOfGivingBack){
        return remainToGiveBack - typeOfGiveBack * stockOfGivingBack;
    }

    static int haveEnoughCashToReturn(int stockFifty, int stockTwenty, int stockTen, int stockFive, int stockTwo, int stockOne){
        return (stockFifty * VALUEOF50) + (stockTwenty * VALUEOF20) + (stockTen * VALUEOF10) + (stockFive * VALUEOF5) + (stockTwo * VALUEOF2) + (stockOne * VALUEOF1);
    }

    static boolean haveEnoughDenomination(int remainToGiveBack, int denomination, int stillRemainOn, int amountOnRemain ){
        return(remainToGiveBack >= denomination && stillRemainOn <= amountOnRemain && amountOnRemain > 0) ? true : false;

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
               // System.out.println( "Combien de billet de 50 voulez vous?");
                //int billet50Desirer = input.nextInt();

                int billet20Desirer = 0;
                int billet10Desirer = 0;
                int billet5Desirer = 0;
                int piece2Desirer = 0;
                int piece1Desirer = 0;

               /* boolean ok50 = amount50Remain >= billet50Desirer;
                boolean ok20 = true;
                boolean ok10 = true;
                boolean ok5 = true;
                boolean ok2 = true;
                boolean ok1 = true;
                */
                if(haveEnoughCashToReturn(amount50Remain, amount20Remain, amount10Remain, amount5Remain, amount2Remain, amount1Remain) < totalBill){
                    System.out.println("montant insuffisant!!!");
                    return;
                }

                //anticipation de la demande de combien de billet de combien on veut lors du remboursement
                /*if(verifStillRemain(stillRemainToGiveBack, VALUEOF50)) {
                    System.out.println("Combien de billet de 20 voulez vous?");
                    billet20Desirer = input.nextInt();
                    ok20 = amount20Remain >= billet20Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack, VALUEOF20)) {
                    System.out.println("Combien de billet de 10 voulez vous?");
                    billet10Desirer = input.nextInt();
                    ok10 = amount10Remain >= billet10Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack, VALUEOF10)) {
                    System.out.println("Combien de billet de 5 voulez vous?");
                    billet5Desirer = input.nextInt();
                    ok5 = amount5Remain >= billet5Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack,VALUEOF5)) {
                    System.out.println("Combien de pièce de 2 voulez vous?");
                    piece2Desirer = input.nextInt();
                    ok2 = amount2Remain >= piece2Desirer;
                }
                if(verifStillRemain(stillRemainToGiveBack,VALUEOF2)) {
                    System.out.println("Combien de pièce de 1 voulez vous?");
                    piece1Desirer = input.nextInt();
                    ok1 = amount1Remain >= piece1Desirer;
                }*/

                    int stillRemainOn50 = stillRemainToGiveBack / VALUEOF50;
                    if (haveEnoughDenomination(stillRemainToGiveBack,  VALUEOF50,  stillRemainOn50,  amount50Remain)) {
                        System.out.println(stillRemainOn50 + " x " + VALUEOF50);
                        stillRemainToGiveBack -= (stillRemainOn50) * VALUEOF50;
                    }
                    int stillRemainOn20 = stillRemainToGiveBack / VALUEOF20;
                    if (haveEnoughDenomination(stillRemainToGiveBack, VALUEOF20, stillRemainOn20, amount20Remain)) {
                        System.out.println(stillRemainOn20 + " x " +VALUEOF20);
                        stillRemainToGiveBack -= (stillRemainOn20) * VALUEOF20;
                    }
                    int stillRemainOn10 = stillRemainToGiveBack / VALUEOF10;
                    if (haveEnoughDenomination(stillRemainToGiveBack,  VALUEOF10, stillRemainOn10,  amount10Remain)) {
                        System.out.println(stillRemainOn10 + " x " + VALUEOF10);
                        stillRemainToGiveBack -= (stillRemainOn10) * VALUEOF10;
                    }
                    int stillRemainOn5 = stillRemainToGiveBack / VALUEOF5;
                    if (haveEnoughDenomination(stillRemainToGiveBack,  VALUEOF5, stillRemainOn5,  amount5Remain)) {
                        System.out.println(stillRemainOn5 + " x " +VALUEOF5);
                        stillRemainToGiveBack -= (stillRemainOn5) * VALUEOF5;
                    }
                    int stillRemainOn2 = stillRemainToGiveBack / VALUEOF2;
                    if (haveEnoughDenomination(stillRemainToGiveBack,VALUEOF2,stillRemainOn2,  amount2Remain)) {
                        System.out.println(stillRemainOn2 + " x " + VALUEOF2);
                        stillRemainToGiveBack -= (stillRemainOn2) * VALUEOF2;
                    }
                    int stillRemainOn1 = stillRemainToGiveBack / VALUEOF1;
                    if (haveEnoughDenomination(stillRemainToGiveBack,VALUEOF1,stillRemainOn1, amount1Remain)) {
                        System.out.println(stillRemainOn1 + " x " + VALUEOF1);
                        stillRemainToGiveBack -= (stillRemainOn1) * VALUEOF1;
                    }




            }
        }
