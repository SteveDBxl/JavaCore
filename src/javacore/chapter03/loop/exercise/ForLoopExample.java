package javacore.chapter03.loop.exercise;

public class ForLoopExample {

    public static void main(String [] args){

        int result = 1;
        for (int i = 1; i <= 10; i++){

            System.out.println(i);
        }
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i++){

            System.out.println(i*2);
        }
        //ou bien
        for(int i =2; i <= 20; i+=2){
            System.out.println(i);
        }
        for(char a= 'A'; a <= 'Z'; a++){

            System.out.println(a);
        }
        for(int i = 1; i <= 6; i++){
            result *= i;
        }
        System.out.println("la factorielle de 6 est : " + result);
    }
}
