package javacore.chapter04.function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args){

        int numberOfPrime = 1;
        int tryOfPrime = 3;
        int divisor = 2;

        while(numberOfPrime < 50){
            divisor = 2;
            while(divisor <= tryOfPrime /2){

                if(tryOfPrime % divisor == 0){
                    if(!isPrime(tryOfPrime)) {
                        break;
                    }
                }
                divisor++;
            }
            //changement ici dans le if
            if(isPrime(tryOfPrime)){
                System.out.println(tryOfPrime);
                numberOfPrime++;
            }
            tryOfPrime++;
        }
    }

    public static boolean isPrime(int number){
        int divisor = 2;
         while(divisor <= number / 2){
             if(number % divisor == 0 ){
                 return false;
             }
             divisor++;
         }
        return true;
    }
}
