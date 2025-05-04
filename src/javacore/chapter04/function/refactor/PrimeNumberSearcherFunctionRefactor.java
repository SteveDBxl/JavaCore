package javacore.chapter04.function.refactor;

import java.util.Scanner;

public class PrimeNumberSearcherFunctionRefactor {

    public static boolean isPrime(int number) {
        for (int potentielPremier = 2; potentielPremier >= (number / 2); potentielPremier++) {

            if(number % potentielPremier == 0){
                System.out.println(number + " n'est pas premier");
                return false;
            }

        }
        System.out.println(number + " est premier");
        return true;
    }
    public static void main(String[] args){

        int checkIfPrime = 151;

        isPrime(checkIfPrime);

    }
}
