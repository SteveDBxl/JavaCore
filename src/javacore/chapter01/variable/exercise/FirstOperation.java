package javacore.chapter01.variable.exercise;

public class FirstOperation {
    public static void main(String[] args)
    {
        int a,b;
        a=20;
        b=10;
        int sum=a+b;
        int sub=a-b;
        int mult=a*b;
        int div=a/b;
        System.out.println("somme : "+sum+"\nsoustraction : "+sub+"\nmultiplication : "+mult+"\ndivision : "+div);

        int c,d;
        c=30;
        d=40;
        c+=d;//c=c+d
        System.out.println(c);
        d-=5;//d=d-5
        System.out.println(d);
        c*=3;//c=c*3
        System.out.println(c);
        d/=3;//d=d/3
        System.out.println(d);

        int e=1 * 5 + 2;
        System.out.println(e);

        int f = 1 * ( 5 + 2 );
        System.out.println(f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        System.out.println(g);

        System.out.println("e = " + e + "\nf = " + f + "\ng = " + g);
    }
}
