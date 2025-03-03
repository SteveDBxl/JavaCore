package javacore.chapter02.condition.practice;

public class PracticeOperatorComparaison {
    public static void main(String[]args)
    {
        int a = 30;
        int b = 40;

        boolean isEqual = a == b;
        System.out.println("est ce que a : " + a + " est égal à b : " + b + " " +isEqual);

        boolean isNotEqual = a != b;
        System.out.println(isNotEqual);

        boolean isLessThan = a < b;
        System.out.println("est ce que a<b? : " + isLessThan);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("est ce que a<=b? : " + isLessThanOrEqual);

        boolean isGreaterThan = a > b;
        System.out.println("est ce que a>b? : " + isGreaterThan);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("est ce que a>=b? : " + isGreaterThanOrEqual);

        boolean isdoubIsLessThanInt = 5.5 < 6;
        System.out.println("est ce que 5.5 < 6? : " + isdoubIsLessThanInt);
    }
}
