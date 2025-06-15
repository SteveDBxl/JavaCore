package javacore.chapter05.object.exercise;

public class AlphabetVowelSearcher {
    public void vowelDisplayer(char vowel, int index){
        System.out.println(vowel + " : sa place => " + index);
    }
    public void vowelSearcher(String searchingIn, String dictionnary){
        for(int index = 0; index < searchingIn.length(); index++){
            for(int indexDico = 0; indexDico < dictionnary.length(); indexDico++){
                if(searchingIn.charAt(index) == dictionnary.charAt(indexDico))
                {
                    // vowelDisplayer(dictionnary.charAt(indexDico), index + 1);
                    vowelDisplayer((dictionnary).charAt(indexDico), searchingIn.indexOf(searchingIn.charAt(index)) + 1);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        AlphabetVowelSearcher avs = new AlphabetVowelSearcher();
        avs.vowelSearcher(alphabet, vowels);

    }
}
