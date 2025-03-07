package javacore.chapter02.condition.exercise;

public class NumberComparaison {
    public static void main(String[] args)
    {
        int number1 ,number2;
        number1 = 39;
        number2 = 20;

        if(number1<number2)
        {
            System.out.println(number1 + " est plus petit que " + number2);
        } else if (number1==number2)
        {
            System.out.println(number1 + " et " + number2 + " sont égaux");
        }
        else
            System.out.println(number1 + " est plus grand que " + number2);

    }
}
