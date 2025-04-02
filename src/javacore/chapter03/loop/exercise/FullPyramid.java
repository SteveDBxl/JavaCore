package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main(String[] args){

        int numberOfRow = 5;
        /**
         * constuira le nombre de ligne que nous aurons à traité
         */
        for(int wichLine = 1; wichLine < numberOfRow; wichLine++){
            /**
             * construira les espaces qui sera = au nombre de ligne et variera en fonction de la ligne à laquelle on est
             */
            for(int numberOfSpace = 5; numberOfSpace - wichLine > 0; numberOfSpace--){
                System.out.print(" ");
            }
            /**
             * construira le sapin avec condition qu'on aille jusqu'au nombre de ligne *2 -1 (regarder la structure => l1 = 1 etoiles l2 = 3 l3 = 5...
             */
            for(int numberOfStar = 1 ;numberOfStar <= wichLine *2 - 1; numberOfStar ++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
