package javacore.chapter05.object.exercise;

public class SubstitutionCipher {

    public String encoderV1(String message, String latinPhabet, String substitutPhabet){
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
        SubstitutionCipher sc = new SubstitutionCipher();

        System.out.println(sc.encoderV1(textToEncrypt, latinAlphabet, substitutionAlphabet));

        String textEncodeV2 = sc.encoderV2(textToEncrypt, latinAlphabet, substitutionAlphabet);
        System.out.println(textEncodeV2);
    }
}
