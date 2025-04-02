package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args){

        int fibonacciQuantityToFind = 50;
        int fibonacciPrev = 0;
        int finbonacciCurrent = 1;
        int fibonacciNext = 0;

        System.out.println(fibonacciPrev + "\n" + finbonacciCurrent);
        for(int index = 3; index <= fibonacciQuantityToFind; index++){
            fibonacciNext = fibonacciPrev + finbonacciCurrent;
            System.out.println(fibonacciNext);
            fibonacciPrev = finbonacciCurrent;
            finbonacciCurrent = fibonacciNext;

        }


    }
}
