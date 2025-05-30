package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class PaperOrderPriceCalculator {

    static final int minQuantityOrderPossible = 200;
    static final int maxQuantityOrderPossible = 200000;
    static final int quantityOrderedLevel30000 = 30000;
    static final int quantityOrderedLevel10000 = 10000;

    static final double priceFrom0To10000 = 0.01;
    static final double priceFrom10001To30000 = 0.005;
    static final double priceFrom30001To200000 = 0.0025;
    static final double applyTax = 1.2;


    double priceOfTheOrder;
    double priceOfTheOrderTTC;
    int quantityOrdered;

    public void setQuantityOrdered(int quantityOrdered){
        this.quantityOrdered = quantityOrdered;
    }

    public double priceCalculator(){
        double finalPrice = 0;

        if(quantityOrdered > quantityOrderedLevel30000){
            finalPrice += (quantityOrdered - quantityOrderedLevel30000) * priceFrom30001To200000;
            quantityOrdered = quantityOrderedLevel30000;
        }
        if(quantityOrdered > quantityOrderedLevel10000){
            finalPrice += (quantityOrdered - quantityOrderedLevel10000) * priceFrom10001To30000;
            quantityOrdered = quantityOrderedLevel10000;
        }
        if(quantityOrdered > 0){
            finalPrice += quantityOrdered * priceFrom0To10000;
        }

        return finalPrice;
    }

    public double addDeliveryCost(){
        return this.priceOfTheOrder + 9.99;
    }

    public void errorMessage(){
        System.out.println("vous avez rentré une valeur incorrect! Veuillez retenter!");
    }

    public void forcedToExitMessage(){
        System.out.println("Vous avez fait trop de mauvaise tentative de commande et nous ne désirons pas travailler avec des gens qui ne savent pas lire");
    }

    public void setPriceOfTheOrder(double price){
        this.priceOfTheOrder = price;
        this.priceOfTheOrderTTC = price * applyTax;
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

        if(paperOrder.priceOfTheOrder < 200){
            paperOrder.addDeliveryCost();
        }

        System.out.println("prix HT : " + paperOrder.priceOfTheOrder);
        System.out.println("prix TTC : " + paperOrder.priceOfTheOrderTTC);
    }
}

