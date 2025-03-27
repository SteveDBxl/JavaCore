package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {

    public static void main(String [] args){

        //2,3,5,20,179
        int number = 179;
        int divisor = 2;

        while (number % divisor != 0){

            divisor++;
            }
        if(divisor == number){
            System.out.println(number + " est premier");
        }
        else{
            System.out.println(number);
        }

    }
}
