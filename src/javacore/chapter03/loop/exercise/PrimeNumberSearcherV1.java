package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args){

        int number = 2;
        int nombreDePremier = 100;
        int compteurDePremier = 1;
        boolean estPremier= true;

        for(int nbIteration = 0; compteurDePremier <= 100; nbIteration++){
            for(int diviseur = 2; diviseur < number; diviseur++){
                if( number % diviseur == 0 ){
                    estPremier = false;
                    break;
                }
                else {
                    estPremier = true;
                }
            }
            if( estPremier ){
                System.out.println(number + " est premier : numéro d'itération " + compteurDePremier ) ;
                compteurDePremier++;
            }
            number++;
        }

    }
}
