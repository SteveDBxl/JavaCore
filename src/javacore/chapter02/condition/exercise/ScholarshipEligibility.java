package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {

    public static void main(String[] args){


        //0, 3.5, 5
        double studentGpa = 3.6;
        //39999, 40000, 60000, 60001
        int householdIncome =40001;
        // true, false
        boolean hasExtracurricular = true;

        if(householdIncome < 40000 && studentGpa > 3.5 && hasExtracurricular){

            System.out.println("Vous avez droit à une bourse complète");
            //je n'avais pas compris l'énnoncé comme étant que hors de ces cas là on avait droit à rien
            //remise dans le même ordre que la condition du dessus
        } else if (householdIncome < 60000 && studentGpa > 3.5 && hasExtracurricular) {
            System.out.println("Vous avez droit à une bourse partielle");
        }
        else{
            System.out.println("tant pis pour les études");
        }

    }
}
