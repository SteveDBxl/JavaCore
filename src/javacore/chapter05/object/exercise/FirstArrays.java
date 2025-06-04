package javacore.chapter05.object.exercise;

import java.sql.Array;

public class FirstArrays {

    public void displayArray(int array[]){
        for(int index = 0; index < array.length; index++){

            System.out.print(array[index]);
            if(index < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public int[] multiplyBy3(int[] array){
        for(int index = 0; index < array.length; index++){
            array[index] *= 3;
        }
        return array;
    }

    public void displayEven(int[] array){
        for(int index = 0; index < array.length; index++){
            if(array[index] % 2 == 0){
            System.out.print(array[index]);
            if(index < array.length - 2){
                System.out.print(", ");
            }
            }
        }
        System.out.println();
    }

    public int[] setTo0IfNextIsDevidedBy3(int [] array){
        for(int index = 0; index < array.length - 1; index ++){
            if(array[index + 1] % 3 == 0){
                array[index] = 0;
            }
        }
        return array;
    }

    public static void main(String[] args){

        int[] integerArray = new int[10];

        for(int i = 0; i < 10; i++){
            integerArray[i] = i + 1;
        }
        FirstArrays fa = new FirstArrays();
        fa.displayArray(integerArray);
        integerArray = fa.multiplyBy3(integerArray);
        fa.displayArray(integerArray);
        fa.displayEven(integerArray);
        integerArray = fa.setTo0IfNextIsDevidedBy3(integerArray);
        fa.displayArray(integerArray);
    }
}
