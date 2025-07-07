package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class BinaryConverter {

    public static boolean verifyIfBinary(String binaryText){

        for(int index = 0; index < binaryText.length(); index++){

            if(binaryText.charAt(index) != '0' && binaryText.charAt(index) != '1'){

                return false;
            }
        }
        return true;
    }

    public static int returnValue(String binaryText){

        int sum = 0;
        int length = binaryText.length();

        for(int index = 0; index < binaryText.length(); index++) {

            String.valueOf('1');
            char character = binaryText.charAt(index);

            if(character == '1'){

                sum += Math.pow(Integer.parseInt(String.valueOf('1')) + 1, (length - index) - 1);
            }
        }
        return sum;
    }

    public static void main(String[] args){

        String binaryText = "";
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Veuillez rentrer un nombre binaire");
            binaryText = sc.next();
        }while(!verifyIfBinary(binaryText));


        sum = returnValue(binaryText);
        System.out.println(sum);

    }
}
