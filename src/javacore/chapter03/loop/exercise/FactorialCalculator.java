package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main(String[] args){


        //a partir de 17 on dépasse la capacité de stockage avec result en int et pour 21 si result est long
        int number =1;
        long result = 1;

        if(number < 0 ){

            System.err.println("Calculer la factorielle demande un nombre entier positif!!");
            return;
        }
        if(number == 0){

            System.out.println("1");
            return;
        }

        while (number > 0){

            result *= number;
            number--;
        }
        System.out.println(result);
    }
}
