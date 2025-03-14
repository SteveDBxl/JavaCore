package javacore.chapter02.condition.exercise;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class CoinChangeV2 {
    public static void main(String[] args) {

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

        System.out.println("Nous devons vous rendre : " + stillRemainToGiveBack + "€1");
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

        if(ok50) {
            System.out.println("Combien de billet de 20 voulez vous?");
            billet20Desirer = input.nextInt();
            ok20 = amount20Remain >= billet20Desirer;
        }
        if(ok50 && ok20) {
            System.out.println("Combien de billet de 10 voulez vous?");
            billet10Desirer = input.nextInt();
            ok10 = amount10Remain >= billet10Desirer;
        }
        if(ok50 && ok20 && ok10) {
            System.out.println("Combien de billet de 5 voulez vous?");
            billet5Desirer = input.nextInt();
            ok5 = amount5Remain >= billet5Desirer;
        }
        if(ok50 && ok20 && ok10 && ok5) {
            System.out.println("Combien de pièce de 2 voulez vous?");
            piece2Desirer = input.nextInt();
            ok2 = amount2Remain >= piece2Desirer;
        }
        if(ok50 && ok20 && ok10 && ok5 && ok2) {
            System.out.println("Combien de pièce de 1 voulez vous?");
            piece1Desirer = input.nextInt();
            ok1 = amount1Remain >= piece1Desirer;
        }
        if(!ok20 || !ok10 || !ok5 || !ok2 || !ok1) {
            System.out.println("Soit nous n'avons pas les coupures que vous demandez soit vous dépassez le montant de retour!!!");
            return;
        }
        if(((amount50Remain * 50) + (amount20Remain * 20) + (amount10Remain * 10) + (amount5Remain * 5) + (amount2Remain * 2) + (amount1Remain *1)
                > amountPaid - totalBill)){
            int stillRemainOn50 = stillRemainToGiveBack / 50;
            if (stillRemainToGiveBack >= 50 && stillRemainOn50 <= amount50Remain && amount50Remain > 0) {
                System.out.println(stillRemainOn50 + " x 50");
                stillRemainToGiveBack -= (stillRemainOn50) * 50;
            }
            int stillRemainOn20 = stillRemainToGiveBack / 20;
            if (stillRemainToGiveBack >= 20 && stillRemainOn20 <= amount20Remain) {
                System.out.println(stillRemainOn20 + " x 20");
                stillRemainToGiveBack -= (stillRemainOn20) * 20;
            }
            int stillRemainOn10 = stillRemainToGiveBack / 10;
            if (stillRemainToGiveBack >= 10 && stillRemainOn10 <= amount10Remain) {
                System.out.println(stillRemainOn10 + " x 10");
                stillRemainToGiveBack -= (stillRemainOn10) * 10;
            }
            int stillRemainOn5 = stillRemainToGiveBack / 5;
            if (stillRemainToGiveBack >= 5 && stillRemainOn5 <= amount5Remain) {
                System.out.println(stillRemainOn5 + " x 5");
                stillRemainToGiveBack -= (stillRemainOn5) * 5;
            }
            int stillRemainOn2 = stillRemainToGiveBack / 2;
            if (stillRemainToGiveBack >= 2 && stillRemainOn2 <= amount2Remain) {
                System.out.println(stillRemainOn2 + " x 2");
                stillRemainToGiveBack -= (stillRemainOn2) * 2;
            }
            int stillRemainOn1 = stillRemainToGiveBack / 1;
            if (stillRemainToGiveBack >= 1 && stillRemainOn1 <= amount1Remain) {
                System.out.println(stillRemainOn1 + " x 1");
                stillRemainToGiveBack -= (stillRemainOn1) * 1;
            }
        }
        else{
            System.out.println("Montant insuffisant en banque");
        }


    }
}
