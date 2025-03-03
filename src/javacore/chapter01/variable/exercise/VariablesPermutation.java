package javacore.chapter01.variable.exercise;

public class VariablesPermutation {
    public static void main(String[] args)
    {
        int a = 3;
        int b = 2;
        int tmp=a;
        a=b;
        b=tmp;

        System.out.println("a : "+ a+ "\n b : " + b);
    }
}
