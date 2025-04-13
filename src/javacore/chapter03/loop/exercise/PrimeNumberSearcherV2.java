package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV2 {

    public static void main(String [] args){
        
        int nbDePremierVoulu = 100;
        boolean isEven = true;
        for(int potentielPremier = 2; nbDePremierVoulu > 0; potentielPremier++ ){
            isEven = true;
            //potentielPremier /2 car on aurait déjà trouvé un candidat dans la première moitié
            for(int potentielDiviseur = 2; potentielDiviseur <= potentielPremier / 2; potentielDiviseur++){

                if(potentielPremier % potentielDiviseur == 0){
                    isEven = false;
                    break;
                }
            }
            if(isEven){
                System.out.println(potentielPremier + " est premier");
                nbDePremierVoulu--;
            }
        }
    }
}
