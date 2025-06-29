package javacore.chapter05.object.exercise;

import java.util.Arrays;

public class BubbleSorting {

    public static int[] naiveSort(int[] array) {

        boolean inversion = true;
        while (inversion) {
            inversion = false;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temporary = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temporary;
                    inversion = true;
                }
            }
        }
        return array;
    }

    public static void quickSort(int[] array, int start, int end) {

        if (start < end) {

            int pivot = partition(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static int partition(int array[], int start, int end) {

        int pivot = array[end];
        int lastSmallest = start - 1;

        for (int index = start; index < end; index++) {
            lastSmallest++;
            swap(array, lastSmallest, index);
        }

        swap(array, lastSmallest + 1, end);
        return lastSmallest + 1;
    }

    // Méthode utilitaire pour échanger deux éléments dans le tableau
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void triParInsertion(int[] array) {


        for (int index = 1; index < array.length; index++) {
            //car on commencera par comparer la valeur juste à gauche dans le tableau
            int comparaisonIndex = index - 1;
            int valueSaved = array[index];

            while (comparaisonIndex >= 0 && array[comparaisonIndex] > valueSaved) {

                array[comparaisonIndex + 1] = array[comparaisonIndex];
                comparaisonIndex--;
            }
            array[comparaisonIndex + 1] = valueSaved;

        }
    }


    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        int[] numbersSorted = new int[100];

        /*numbersSorted = Arrays.stream(numbers).sorted().toArray();

        for(int number : numbersSorted){

            System.out.print(number + " ");
        }*/

        /*int[] bubbleSort = naiveSort(numbers);

        System.out.print("\nbubble : ");
        for(int index = 0; index < bubbleSort.length; index++){

            System.out.print( bubbleSort[index] + " ");
        }*/
        triParInsertion(numbers);
        System.out.println("Insertion\n--------------------------------------------\n");
        for(int number : numbers){

            System.out.print(number + " ");
        }

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("\n\n\nTri Rapide\n-------------------------------------\n");
        for (int index = 0; index < numbers.length; index++) {

            System.out.print(numbers[index] + " ");
        }


    }
}

