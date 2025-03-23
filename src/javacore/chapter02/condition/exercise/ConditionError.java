package javacore.chapter02.condition.exercise;

public class ConditionError {

    public static void main(String[] args){

            int age = 60;

            if(age <= 16) {
                System.out.println("Vous êtes mineur.");
            }
            else if(age == 17) {
                System.out.println("Vous êtes bientôt majeur !");
            }
            else if(age == 18) {
                System.out.println("Vous êtes majeur.");
            }
            // pas de limitation et donc 18+ ou 60+ rentrait ici
            //j'ai fais le changement <= 60 au lieu de < 61 comme indiquer dans ta vidéo
            else if(age > 18 && age <= 60) {
                System.out.println("Vous êtes un adulte.");
            }
            else if(age > 60 && age < 100) {
                System.out.println("Vous n'êtes plus tout jeune.");
            }
            else {
                System.out.println("Vous êtes une exception dans ce monde !");
            }
    }
}

