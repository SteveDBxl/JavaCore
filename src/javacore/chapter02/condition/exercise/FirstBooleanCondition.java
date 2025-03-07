package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {
    public static void main(String[] args)
    {
        byte age = 39;

        boolean isAdulte = true;
        isAdulte = age >= 18;

        if(isAdulte)
        {
            System.out.println("Vous êtes majeur");
        }
        else
            System.out.println("vous êtes mineur");
    }
}
