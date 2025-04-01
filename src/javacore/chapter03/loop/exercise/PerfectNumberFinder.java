package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String [] args){

        int start, end;
        end = 1000;

        //start à 2 car 1 est forcément exclus vu la règle
        for(start = 2; start < end; start++ ){
            int somme = 1;
            //potentielDiviseur commence à 2 car 1 est forcément diviseur  et somme = 1 pour cette meme raison
            for(int potentielDiviseur = 2; potentielDiviseur < start; potentielDiviseur++){

                if(start % potentielDiviseur == 0){

                    somme += potentielDiviseur;
                }
            }
            if(somme == start){
                System.out.println(start + " est un nombre parfait");
            }
        }
    }
}
