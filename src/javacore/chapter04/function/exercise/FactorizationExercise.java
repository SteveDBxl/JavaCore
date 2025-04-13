package javacore.chapter04.function.exercise;

public class FactorizationExercise {

    public static void main(String[] args){

           /* // Afficher les nombres de 1 à 5
            for (int i = 1; i <= 5; i++) {
                System.out.println("Nombre: " + i);
            }

            // Afficher la table de multiplication de 2
            System.out.println("Table de multiplication de 2 :");
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 x " + i + " = " + (2 * i));
            }

            // Afficher la table de multiplication de 3
            System.out.println("Table de multiplication de 3 :");
            for (int i = 1; i <= 10; i++) {
                System.out.println("3 x " + i + " = " + (3 * i));
            }

            // Afficher la table de multiplication de 6
            System.out.println("Table de multiplication de 6 :");
            for (int i = 1; i <= 10; i++) {
                System.out.println("6 x " + i + " = " + (6 * i));
            }

            // Afficher les carrés des nombres de 1 à 5
            System.out.println("Carrés des nombres de 1 à 5 :");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " au carré = " + (i * i));
            }

            // Afficher les carrés des nombres de 6 à 10
            System.out.println("Carrés des nombres de 6 à 10 :");
            for (int i = 6; i <= 10; i++) {
                System.out.println(i + " au carré = " + (i * i));
            }*/

        multTable(8);
        squareTable(5,25);

        }

        public static void multTable (int value){

            System.out.println("Table de multiplication de " + value);
            for(int count = 1; count <= 10; count++){
                System.out.println(count + " x " + value + "= " + count * value);
        }
    }

    public static void squareTable(int begin, int end){
        System.out.println("Carré de " + begin + " à " + end);
        for(int count = begin; count <= end; count++){
            System.out.println(count + " au carré = " + count * count );
        }
    }
}
