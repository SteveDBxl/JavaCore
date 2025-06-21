package javacore.chapter05.object.exercise;

public class SubstitutionCipher {

    public static String encoderV1(String message, String latinPhabet, String substitutPhabet){
        String encodeMessage = "";
        for(int indexMessage = 0; indexMessage < message.length(); indexMessage++){
            if(message.charAt(indexMessage) == ' '){
                encodeMessage += ' ';
                indexMessage++;
            }
            for(int indexLatin = 0; message.charAt(indexMessage) >= latinPhabet.charAt(indexLatin); indexLatin++){
                if(message.charAt(indexMessage) == latinPhabet.charAt(indexLatin)){
                    encodeMessage += substitutPhabet.charAt(indexLatin);
                }
            }
        }
        return encodeMessage;
    }

    public String encoderV2 (String text, String regex, String subsitution){
        String textEncode = "";
        textEncode = text.replaceAll(regex, subsitution);

        return textEncode;
    }

    public static String cipher(String textToExrypt, String latinPhabet, String substituPhabet, int cipherIteration) {

        String encodeMessage = "";
        for (int iteration = 0; iteration < cipherIteration; iteration++) {
            for (int indexMessage = 0; indexMessage < textToExrypt.length(); indexMessage++) {
                if (textToExrypt.charAt(indexMessage) == ' ') {
                    encodeMessage += ' ';
                    indexMessage++;
                }
                if(textToExrypt.charAt(indexMessage) == '!'){
                    encodeMessage += '!';
                    break;
                }
                for (int indexLatin = 0; textToExrypt.charAt(indexMessage) >= latinPhabet.charAt(indexLatin); indexLatin++) {
                    if (textToExrypt.charAt(indexMessage) == latinPhabet.charAt(indexLatin)) {
                        encodeMessage += substituPhabet.charAt(indexLatin);
                    }
                }
            }
            textToExrypt = encodeMessage;
            encodeMessage = "";
        }
        return textToExrypt;
    }

    public static void main(String[] args) {

        /**
         * Alphabet Standard (Latin)
         */
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        /**
         *  Alphabet de Substitution
         */
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

        /**
         *  Texte à chiffrer
         */
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        String textEncodeXTime = "";

        SubstitutionCipher sc = new SubstitutionCipher();

        System.out.println(sc.encoderV1(textToEncrypt, latinAlphabet, substitutionAlphabet));

        System.out.println(textToEncrypt.replaceAll(textToEncrypt, substitutionAlphabet) + " : hors fonction");
        String textEncodeV2 = sc.encoderV2(textToEncrypt, latinAlphabet, substitutionAlphabet);
        System.out.println(textEncodeV2 + " : V2");
        textEncodeXTime =sc.cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, 3);

        System.out.println(textEncodeXTime +" : encodage x fois");
    }
}
