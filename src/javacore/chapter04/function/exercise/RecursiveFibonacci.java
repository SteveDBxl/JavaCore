package javacore.chapter04.function.exercise;

public class RecursiveFibonacci {

    public static void fiboRacursive(long number1, long number2, int indice){

        System.out.print(number1 + ", " + number2 + ", ");
        number1 = number1 + number2;
        if(indice < 50){
            fiboRacursive(number1, number2+number1, indice+1);
        }

    }

    public static void main (String args[]){
        fiboRacursive(0,1, 1);
    }
}
