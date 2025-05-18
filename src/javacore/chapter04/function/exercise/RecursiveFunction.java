package javacore.chapter04.function.exercise;

public class RecursiveFunction {
    static void countToThousand(int indice){
        System.out.println(indice);
        if(indice < 1000) {
            countToThousand(indice + 1);
            return;
        }
        return;
    }
    public static void main(String args[]){
        countToThousand(1);
    }
}
