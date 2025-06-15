package javacore.chapter05.object.exercise;

import java.util.Dictionary;
import java.util.Scanner;

public class VowelCounter {
    String vowel = "aeiouy";

    public int vowelCounter(String text){
        int counter = 0;
        Character currentCharTest = ' ';
        Character currentVowelCheck = ' ';
        for(int index = 0; index < text.length(); index++){
            currentCharTest = text.charAt(index);
            for(int vowelDico = 0; vowelDico < this.vowel.length(); vowelDico++){
                currentVowelCheck = vowel.charAt(vowelDico);
                if(currentCharTest.equals(currentVowelCheck)){
                    counter++;
                    break;
                }
            }

        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        System.out.println("Ecrivez un text, nous en calculerons le nombre de voyelle");
        char caracter = 'e';

        //String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

        String text = sc.nextLine();
        VowelCounter vc = new VowelCounter();
        System.out.println("Il y a " + vc.vowelCounter(text) + " voyelles dans ce text");
        System.out.println("index de e : " + text.indexOf('e', 0));
    }
}
