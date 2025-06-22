package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class SubstitutionCipher {

    private int iterationWanted;
    private String textFromUser;
    private boolean encode;

    public void setIterationWanted(int number){
        this.iterationWanted = number;
    }

    public void setTextFromUser(String text){
        this.textFromUser = text;
    }

    public void setEncode(boolean encode){
        this.encode = encode;
    }

    public static String encoderV1(String message, String encodeAlphabet, String normalAlphabet){

        String text = "";
        int valueOfCharacter;

        for(int indexMessage = 0; indexMessage < message.length(); indexMessage++){
            if(message.charAt(indexMessage) == ' ' || message.charAt(indexMessage) == '!'){
                text += message.charAt(indexMessage);
            }
            else{
                //différence (-97) faite par rapport à la table ascii
                valueOfCharacter = message.charAt(indexMessage) - 97;
                text += encodeAlphabet.charAt(valueOfCharacter);
            }
        }
        return text;
    }

    public String encoderV2 (String text, String regex, String substitution){
        String textEncode = "";
        String valueOfCharRegex = "";
        String valueOfCharSubstitution = "";
        for(int index = 0; index < regex.length(); index++){
            valueOfCharRegex = String.valueOf(regex.charAt(index));
            valueOfCharSubstitution = String.valueOf(substitution.charAt(index));
            textEncode = text.replaceAll(valueOfCharRegex, valueOfCharSubstitution);
        }

        return textEncode;
    }

    public static String cipher(String textToExrypt, String latinPhabet, String substituPhabet, int cipherIteration) {

        String encodeMessage = "";
        for (int iteration = 0; iteration < cipherIteration; iteration++) {
            encodeMessage = encoderV1(textToExrypt, substituPhabet, latinPhabet);
            textToExrypt = encodeMessage;
            }
        return encodeMessage;
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
        int iterationChoice = 1;

        SubstitutionCipher sc = new SubstitutionCipher();
        SubstitutionCipher userSC = new SubstitutionCipher();

        System.out.println(sc.encoderV1(textToEncrypt, substitutionAlphabet, latinAlphabet));

        String textEncodeV2 = sc.encoderV2(textToEncrypt, latinAlphabet, substitutionAlphabet);
        System.out.println(textEncodeV2 + " : V2");

        textEncodeXTime =sc.cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, 3);
        System.out.println(textEncodeXTime +" : encodage 3 fois");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de fois voulez vous encoder votre message ?");
        iterationChoice = scanner.nextInt();
        if(iterationChoice < 1){
            iterationChoice = 1;
        }

        textEncodeXTime = sc.cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, iterationChoice);
        System.out.println(textEncodeXTime + " : à été encoder " + iterationChoice + " fois");

        //textEncodeXTime = sc.decodeMessage(textEncodeXTime, substitutionAlphabet, latinAlphabet, 1);
        //System.out.println(textEncodeXTime);
        System.out.println("Bonjour, veuillez entrer un text");
        userSC.setTextFromUser(scanner.next());
        System.out.println("Maintenant, veuillez entrer le nombre d'itération pour le codage ou le décodage");
        userSC.setIterationWanted(scanner.nextInt());
        System.out.println("Voulez vous coder votre message? Si non, alors il sera décodé (true ou false)");
        userSC.setEncode(scanner.nextBoolean());

        if(userSC.encode){
            System.out.println(userSC.cipher(userSC.textFromUser, latinAlphabet, substitutionAlphabet, userSC.iterationWanted ));
        }
    }
}
