package javacore.chapter04.function.refactor;

public class CoinChangeFunctionRefactor {

    public static int paybackc(int money, int amount){
        int count;
        for(count = 0; amount > money; count++){
            amount -= money;
        }
        return count;
    }

    public static int amountLess(int time, int money, int amount){
        int finalAmount = amount - (time * money);
        return finalAmount;
    }

    public static void main(String[] args){

        int somme = paybackc(50,160);
        int finalSomme = amountLess(somme,50,160);
        System.out.println(finalSomme);
    }
}
