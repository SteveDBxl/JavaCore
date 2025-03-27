package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {

    public static void main(String[] args){

        int age =15;

        if(age < 18){

            System.out.println("Hello World");
        }
        while(age < 18){

            System.out.println("Hello World");
            age++;
        }

        System.out.println("On est sorti de la boucle");

        int result = 0;

        int i = 1;
        int maxValue = 100;
        while (i <= maxValue){

            result+=i;
            i++;
        }
        System.out.println(result);
    }
}
