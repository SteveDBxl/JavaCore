package javacore.chapter05.object.exercise;

public class ReversedString {

    public String reversString(String word){

        String reversedWord = "";
        for(int index = word.length() - 1; index >= 0; index--){
          reversedWord += word.charAt(index);
        }
        return reversedWord;
    }

    public static void main(String[] args){

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";

        ReversedString rs = new ReversedString();
        text = rs.reversString(text);
        System.out.println(text);
    }
}
