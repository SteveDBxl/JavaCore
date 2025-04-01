package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args){
/*
        //representera le nombre premier
        int nombrePremier = 2;
        //permet de déterminer combien de nb premier nous désirons afficher
        int nombreDePremier = 100;
        //combien de nb premier on déjà été affiché
        int compteurDePremier = 1;
        //détermine si nous avons affaire à un nb premier et l'afficher si tel est le cas
        boolean estPremier= true;


        //nb itération permet de savoir combien de nombre nous avons tes
        for(int nbIteration = 0; compteurDePremier <= nombreDePremier; nbIteration++){
            estPremier = true;
            for(int potentielDiviseur = 2; potentielDiviseur < nombrePremier; potentielDiviseur++){
                if( nombrePremier % potentielDiviseur == 0 ){
                    estPremier = false;
                    break;
                }
            }
            if( estPremier ){
                System.out.println(nombrePremier + " est premier : numéro d'itération " + compteurDePremier ) ;
                compteurDePremier++;
            }
            nombrePremier++;
        }
*/
        //Version plus économ en calcul

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
