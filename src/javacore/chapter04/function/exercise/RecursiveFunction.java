package javacore.chapter04.function.exercise;

public class RecursiveFunction {
    static void countToThousand(int indice){
        System.out.println(indice);
        if(indice >= 1000) {
            return;
        }
        countToThousand(indice + 1);
    }
    public static void main(String args[]){
        countToThousand(1);
    }
}
