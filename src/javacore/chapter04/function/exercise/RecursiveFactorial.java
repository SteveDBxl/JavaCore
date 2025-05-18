package javacore.chapter04.function.exercise;

public class RecursiveFactorial {

    public static int factoRecursive(int target){
        if( target < 2){
            return 1;
        }
        return target * factoRecursive( target - 1);
    }

    public static void main(String args[]){
        System.out.println(factoRecursive(6));
    }
}
