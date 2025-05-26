package javacore.chapter05.object.exercise;
import java.util.Scanner;

public class UserQuestionnaire {



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double result;
        boolean yesOrNo;
        String response;


        System.out.println("Quel est votre name?\n");
        name = sc.nextLine();
        // System.out.println(name + " est ce bien votre nom?");
        System.out.println("Quel est votre age?");
        age = sc.nextInt();
        System.out.println("Voulez vous continuer à répondre aux questions? (true ou flase)");
        yesOrNo = sc.nextBoolean();

       // System.out.println("Souhaitez vous continuer à répondre aux questions? (oui ou non)");
       // response = sc.nextLine();

       /* switch (response){

            case "oui" :
                System.out.println("quel est le résultat de 5/2 ?");
                result = sc.nextDouble();
                break;

            case "non":
                return;
        }*/

    }
}
