package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int numberTry = 0;
        int numberTryCopy = numberTry;
        int somme = 1;
        long finalSomme = 0;
        int exposant = 0;
        int calculExposant = 1;
        int lastDigit = 0;
        int howManyDigit;
        int numberOfAmstrong = 0;

        while (numberOfAmstrong <= 30) {
            numberTry = numberTryCopy;
            howManyDigit = numberTry;
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

            if (numberTryCopy == finalSomme) {
                System.out.println(numberTryCopy + " est un nombre narcissique !!!");
                numberOfAmstrong++;
            }
            numberTryCopy++;
            exposant = 0;
            finalSomme = 0;
        }
    }
}
