package javacore.chapter03.loop.exercise;

public class BasicStopwatch {
    public static void main(String [] args) throws InterruptedException{
            int i = 0;

        System.out.println("");
            /*
             * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
             */
            while(i < 100) {

                /*
                 * Effectue une "pause" de 1000 millisecondes / 1 seconde
                 */
                Thread.sleep(1000);
                System.out.println(i + " seconde s'est écoulée");

                /*
                 * Incrémente "i = i + 1;" pour atteindre la condition de la boucle while
                 */
                i++;
            }


    }
}
