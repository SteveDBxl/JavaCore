package javacore.chapter03.loop.exercise;

public class AlphabetPrinter {

    public static void main(String[] args){

        char letter = 'A';
        int count = 0;
        while (count <= 25){
            System.out.println(letter);
            letter ++;
            count ++;
        }
        System.out.println("\n\n\n" + "méthode 2");
        letter = 'A';
        while (letter <= 'Z'){
            System.out.println(letter);
            letter ++;
        }

        //find 'a'
        while (letter != 'a'){
            letter --;
        }
        System.out.println("\n\n\nA partir de la minuscule 'a'\n");
        while (letter <= 'z'){
            System.out.println(letter);
            letter ++;
        }

    }

}
