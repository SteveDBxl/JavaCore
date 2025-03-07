package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {
    public static void main(String [] args)
    {
        double number = -8;
        if(number>0)
        {
            System.out.println( number + " est positif");
        }
        else if(number<0)
        {
            System.out.println( number + " est negatif");
        }
        else
        {
            System.out.println(number + " est neutre");
        }
        /*
        *if(number<0)
        * {
        *   System.out.println( number + " est negatif");
         * }
         * else if(number>0)
         * {
         *   System.out.println( number + " est positif");
         * }
         * else if(number==0)
         *
         * {
         *   System.out.println( number + " est neutre");
         * }    *  */

    }
}
