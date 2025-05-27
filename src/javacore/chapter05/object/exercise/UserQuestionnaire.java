package javacore.chapter05.object.exercise;
import java.util.Scanner;

public class UserQuestionnaire {

    int age;
    String name;
    String response;
    double result;
    boolean trueOrFalse;

    public void setAge(int age){
        this.age = age;
    }
     public void setName(String name){
        this.name = name;
     }

     public void setResponse(String response){
        this.response = response;
     }

     public void setResult(double result){
        this.result = result;
     }

     public void setTrueOrFalse(boolean trueOrFalse){
        this.trueOrFalse = trueOrFalse;
     }

     public void displayResponses(){
         System.out.println("votre nom : " + name + "\nvotre age : " + age + "\non continue? : " + "\nRésultat de 5/2 : " + result);
     }


    public static void main(String [] args){

        UserQuestionnaire uq = new UserQuestionnaire();
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double result;
        boolean yesOrNo;
        String response;

        System.out.println("Quel est votre nom?");
        name = sc.nextLine();
        uq.setName(name);

        System.out.println("Quel est votre age?");
        age = sc.nextInt();
        uq.setAge(age);

        System.out.println("Voulez vous continuer à répondre aux questions? (true ou flase)");
        yesOrNo = sc.nextBoolean();
        uq.setTrueOrFalse(yesOrNo);

        System.out.println("Souhaitez vous continuer à répondre aux questions? (oui ou non)");
        response = sc.next();
        uq.setResponse(response);

       if(!response.equals("oui")){
           System.out.println("Au revoir!");
           return;
       }

       System.out.println("Quel est la valeur de 5/2 (x,x si nécessaire)");
       result = sc.nextDouble();
       uq.setResult(result);

       uq.displayResponses();

    }
}
