package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class PaperOrderPriceCalculator {

    static final int MIN_QUANTITY_ORDER_POSSIBLE = 200;
    static final int MAX_QUANTITY_ORDER_POSSIBLE = 200000;
    static final int QUANTITY_ORDERED_LEVEL_30000 = 30000;
    static final int QUANTITY_ORDERED_LEVEL_10000 = 10000;

    static final double PRICE_FROM_0_TO_10000 = 0.01;
    static final double PRICE_FROM_10001_TO_30000 = 0.005;
    static final double PRICE_FROM_30001_TO_200000 = 0.0025;
    static final double APPLY_TAX = 1.2;


    double priceOfTheOrderHT;
    double priceOfTheOrderTTC;
    int quantityOrdered;

    public void setQuantityOrdered(int quantityOrdered){
        this.quantityOrdered = quantityOrdered;
    }

    public double priceCalculator(){
        double finalPrice = 0;

        if(this.quantityOrdered > QUANTITY_ORDERED_LEVEL_30000){
            finalPrice += (this.quantityOrdered - QUANTITY_ORDERED_LEVEL_30000) * PRICE_FROM_30001_TO_200000;
            this.quantityOrdered = QUANTITY_ORDERED_LEVEL_30000;
        }
        if(this.quantityOrdered > QUANTITY_ORDERED_LEVEL_10000){
            finalPrice += (this.quantityOrdered - QUANTITY_ORDERED_LEVEL_10000) * PRICE_FROM_10001_TO_30000;
            this.quantityOrdered = QUANTITY_ORDERED_LEVEL_10000;
        }
        if(this.quantityOrdered > 0){
            finalPrice += this.quantityOrdered * PRICE_FROM_0_TO_10000;
        }

        return finalPrice;
    }

    public double addDeliveryCost(){
        return this.priceOfTheOrderHT + 9.99;
    }

    public void errorMessage(){
        System.out.println("vous avez rentré une valeur incorrect! Veuillez retenter!");
    }

    public void forcedToExitMessage(){
        System.out.println("Vous avez fait trop de mauvaise tentative de commande et nous ne désirons pas travailler avec des gens qui ne savent pas lire");
    }

    public void setPriceOfTheOrder(double price){
        this.priceOfTheOrderHT = price;
        this.priceOfTheOrderTTC = price * APPLY_TAX;
    }


    public static void main(String[] args){

        int order;
        int tentative = 0;
        double price;
        PaperOrderPriceCalculator paperOrder = new PaperOrderPriceCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, combien de papier voulez vous commander? (Possible entre 200 et 200.000)");

        do{
            order = sc.nextInt();
            tentative++;
        }while((order < 200 && order <= 200000) && tentative < 5 );

        if(tentative >=5){
            paperOrder.forcedToExitMessage();
            return;
        }
        paperOrder.setQuantityOrdered(order);
        price = paperOrder.priceCalculator();
        paperOrder.setPriceOfTheOrder(price);

        if(paperOrder.priceOfTheOrderHT < 200){
            paperOrder.addDeliveryCost();
        }

        System.out.println("prix HT : " + paperOrder.priceOfTheOrderHT);
        System.out.println("prix TTC : " + paperOrder.priceOfTheOrderTTC);
    }
}

