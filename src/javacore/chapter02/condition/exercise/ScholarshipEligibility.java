package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {

    public static void main(String[] args){


        //0, 3.5, 5
        double studentGpa = 3.6;
        //39999, 40000, 60000, 60001
        int householdIncome =40001;
        // true, false
        boolean hasExtracurricular = false;

        if(((householdIncome < 40000 && studentGpa > 3.5))&& hasExtracurricular){

            System.out.println("Vous avez droit à une bourse complète");
        }
        if(hasExtracurricular && studentGpa > 3.5 &&  householdIncome < 60000){

            System.out.println("Vous avez droit à une bourse partielle");
        }
        if((!hasExtracurricular || hasExtracurricular) && studentGpa <= 3.5 && householdIncome > 60000){

            System.out.println("tant pis pour les études");
        }
        else{

            System.out.println("aucune donnée de comment traité le cas");
        }
    }
}
