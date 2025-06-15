package javacore.chapter05.object.exercise;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class LongestWordFinder {

    public String splitByMyself(String word) {
        int index = 0;
        int startingPoint; 
        int countLength = 0;
        int max = 1;
        String longestChar = " ";
        String analyseStirngLength = " ";

        //pas encore vu avec la formation mais utilisation du type dicitonnaire possible
            char lastChar = word.charAt(index);
            while(index < word.length() -1){
                    if(word.charAt(index) != ' '){
                        analyseStirngLength += word.charAt(index);
                    }
                    if(word.charAt(index) == ' '){
                        if(analyseStirngLength.length() > longestChar.length()){
                            longestChar = analyseStirngLength;
                        }
                        analyseStirngLength = "";
                    }
                    index++;
            }
        return longestChar;
        }



    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";
        String [] textWithSplitExec = text.split("[\\s]");
        String longestWord = " ";
        int maxLength = 0;
        int index = 0;
        int max = 0;

        LongestWordFinder lWF = new LongestWordFinder();

        while(index < textWithSplitExec.length){
            if(textWithSplitExec[index].length() > maxLength) {
                longestWord = textWithSplitExec[index];
                maxLength = longestWord.length();
            }
            index++;
        }

        String response = " ";

        System.out.println(longestWord + " : voici le plus long mot");

        response = lWF.splitByMyself(text);

        System.out.println(response + " : réponse avec POO");
    }
}
