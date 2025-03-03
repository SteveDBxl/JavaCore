package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {
    public static void main(String[]args)
    {
        short hourSeconds = 3600;
        int daySeconds = hourSeconds*24;
        System.out.println(daySeconds);
        int weekSeconds = daySeconds*7;
        System.out.println(weekSeconds);
        int monthSeconds = daySeconds*30;
        System.out.println(monthSeconds);
        int yearSeconds = daySeconds*365;
        System.out.println(yearSeconds);
    }
}
