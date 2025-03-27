package javacore.chapter03.loop.exercise;

public class WhileLoopExample {

    public static void main(String [] args){

        int i = 1;

        while(i <= 1000){

            System.out.println(i + " : Hello world");
            i++;
        }

        int number = 1;

        while(number <= 10){
            System.out.println(number);
            number++;
        }

        int rebours = 1;
        while(rebours <= 10){

            System.out.println(11-rebours);
            rebours++;
        }

        int paire = 1;
        while(paire <= 10){

            System.out.println(paire * 2);
            paire++;
        }
    }
}
