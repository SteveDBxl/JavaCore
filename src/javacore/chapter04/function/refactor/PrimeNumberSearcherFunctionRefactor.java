package javacore.chapter04.function.refactor;

public class PrimeNumberSearcherFunctionRefactor {

    public static boolean isPrime(int number) {
        boolean isEven;
        int nbDePremierVoulu = 100;
        for (int potentielPremier = 2; nbDePremierVoulu > 0; potentielPremier++) {

            //potentielPremier /2 car on aurait déjà trouvé un candidat dans la première moitié
            for (int potentielDiviseur = 2; potentielDiviseur <= potentielPremier / 2; potentielDiviseur++) {

                if (potentielPremier % potentielDiviseur == 0) {
                    return false;

                } else {
                    return true;
                }
            }

        }
        return true;
    }
    public static void main(String[] args){

    }
}
