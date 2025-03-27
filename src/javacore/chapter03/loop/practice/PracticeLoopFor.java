package javacore.chapter03.loop.practice;

public class PracticeLoopFor {

    public static void main(String[] args){

        System.out.println("Hello world");

        int result = 0;
        int maxNumber = 100;

        for (int cNumber = 1; cNumber <= maxNumber; cNumber++){
            result += cNumber;
        }
        System.out.println( result);

        for(int a = 1; a <= maxNumber; a++){

            if(a % 2 == 0){

                int resultForIf = 0;
                for (int b = 1; b <= a; b++){
                    resultForIf += b;
                }
                System.out.println("Somme des nombres entre 1 et " + a + " : " +resultForIf);
            }
            else{
                System.out.println("Le nombre suivant est impair " + a);
            }
        }

    }
}
