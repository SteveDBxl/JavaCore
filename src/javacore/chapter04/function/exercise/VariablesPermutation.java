package javacore.chapter04.function.exercise;

public class VariablesPermutation {

    public static void main(String[] args){

        int num1, num2, num3;
        int somme = 0;
        num1 = 5;
        num2 = 3;
        num3 = 5;
        somme = sum(num1,num2,num3);
        System.out.println(somme);

    }
    static int sum(int number1, int number2){

        return number1 + number2;
    }

    static int sum(int number1, int number2, int number3){

       return sum(number1, sum(number2, number3));
    }
}
