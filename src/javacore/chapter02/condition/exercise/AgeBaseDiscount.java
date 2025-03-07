package javacore.chapter02.condition.exercise;

public class AgeBaseDiscount {
    public static void main(String []args)
    {
        //
        int age = 65;

        //
        double price = 50;

        if(age >= 65)
        {
            System.out.println("Grâce à une reduction de 75%, vous passez de " + price + " à " + price*0.25);
        }
        else if (age<26)
        {
            System.out.println("Grâce à une réduction de 25%, vous passez de " + price + " à " + price*0.75);
        }
        else
            System.out.println("Merci de payé pour les autres, cela fera " + price);
    }
}
