package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main(String[] args){

        int limitMultiplier = 9;
        for(int multiplier = 1; multiplier <= 9; multiplier++){

            System.out.print("Table de " + multiplier + " : ");
            for(int timeMultiplier = 1; timeMultiplier <= 10; timeMultiplier++){
                System.out.print(multiplier * timeMultiplier + " ");
            }
            System.out.println();
        }
    }
}
