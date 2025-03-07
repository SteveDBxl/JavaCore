package javacore.chapter02.condition.exercise;

import java.util.Random;

public class ParityChecker {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int number = rnd.nextInt(20000-0)+1;

        if(number%2==0){
            System.out.println("Number : "+number +" est paire");
        }
        else
        {
            System.out.println("Number : "+number +" est impaire");
        }
    }
}
