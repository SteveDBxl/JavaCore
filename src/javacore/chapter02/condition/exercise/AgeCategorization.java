package javacore.chapter02.condition.exercise;

public class AgeCategorization {
    public static void main(String [] args)
    {
        //
        int age = 39;

        if(age<10)
        {
            System.out.println("Vous êtes un enfant");
        }
        else if(age>=10 && age<18)
        {
            System.out.println("Vous êtes un adolescent");
        } else if (age>=18 && age<25)
        {
            System.out.println("Vous êtes un jeune adiulte");
        }
        else if(age>=25 && age<65)
        {
            System.out.println("Vous êtes un adulte");
        }
        else
            System.out.println("Vous êtes un senior");
    }
}
