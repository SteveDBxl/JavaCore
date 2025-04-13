package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int numberTry = 0;
        int numberTryCopy = numberTry;
        int calculExposant = 1;
        int numberOfAmstrong = 0;
        int currentAmstrongNumber = 10;

        //25 ça passe :)
        while (numberOfAmstrong <= 25) {
            int somme = 1;
            int howManyDigit = numberTry;
            int lastDigit = 0;
            long finalSomme = 0;
            int exposant = 0;
            numberTry = numberTryCopy;
            while (howManyDigit > 0) {
                howManyDigit /= 10;
                exposant++;
            }
            while (numberTry > 0) {
                lastDigit = numberTry % 10;
                while (exposant >= calculExposant) {
                    somme *= lastDigit;
                    calculExposant++;
                }

                finalSomme += somme;
                numberTry /= 10;
                calculExposant = 1;
                somme = 1;
            }

            if (finalSomme == numberTryCopy) {
                System.out.println(numberTryCopy + " est un nombre narcissique !!!");
                numberOfAmstrong++;
            }
            numberTryCopy++;
        }
    }
}
