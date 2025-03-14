package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {
    public static void main(String [] args){

        //&& ne renvoie vrai que lorsque tous les operateur sont a vrai
        boolean trueAndTrue = true && true; // true (vrai)
        boolean falseAndFalse = false && true;// false (false)
        boolean trueAndFalse = true && false;// false
        boolean falseAndTrue = false && true;//false

        //|| renvoie vrai lorsque au moins un des opérateur est vrai
        boolean trueOrFalse = true || false;//true
        boolean falseOrTrue = false || true;//true
        boolean trueOrTrue = true || true;//false
        boolean falseOrFalse = false || false;//true

        boolean notTrue = !true;//false
        boolean notFalse = !false;//true

        boolean trueAndtrueAndTrue = true && true && true;//true
        boolean falseAndTrueAdnTrue = false && true && true;//false

        boolean trueOrTrueOrTrue = true || true || true;//true
        boolean falseOrTrueOrTrue = false || true || true;//true

        boolean notNottrue = !!true;//true
        boolean notNotFalse = !!false;//false


        boolean isLoggedIn = true;//user est il co?

        int age = 25;

        int seatAvailable = 40;//nombre de place dispo

        boolean isPremiumMember = true;//utilisateur Vip?

        boolean isVipMember = true;//vol réservé au Vip?

        if(isLoggedIn && age > 17 && seatAvailable > 0 && (!isPremiumMember || isVipMember)){

            System.out.println("réservation faite");
        }
        else{

            System.out.println("réservation impossible!");
        }


    }
}
