package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args){

        int fibonacciQuantityToFind = 50;
        long fibonacciPrev = 0;
        long fibonacciCurrent = 1;
        long fibonacciNext = 0;

        System.out.println(fibonacciPrev + "\n" + fibonacciCurrent);
        for(int index = 3; index <= fibonacciQuantityToFind; index++){
            fibonacciNext = fibonacciPrev + fibonacciCurrent;
            System.out.println(fibonacciNext);
            fibonacciPrev = fibonacciCurrent;
            fibonacciCurrent = fibonacciNext;

        }


    }
}
