package javacore.chapter02.condition.practice;

public class PracticeConditions {
    public static void main(String [] args)
    {
        int age = 19;

        if(age <18){
            System.out.println("Vous êtes mineur");
        }
        else if(age == 18)
        {
            System.out.println("vous êtes tout juste majeur");
        }
        else
        {
            System.out.println("vous êtes majeur");
        }
    }
}
