package javacore.chapter01.variable.exercise;

public class FirstInstructions {
    public static void main(String[] args)
    {
        int age= 39;
        System.out.println(age);
        System.out.println("j'ai " + age+" ans");
        String displayAge= "j'ai " + age+" ans";
        System.out.println(displayAge);
        String firstName= "Steve ";
        System.out.println(firstName);
        String displayFirstName = "je m'appelle " + firstName;
        System.out.println(displayFirstName + displayAge);
        System.out.println("Je m'appelle " + firstName + " et j'ai "+age+" ans.");
    }
}
