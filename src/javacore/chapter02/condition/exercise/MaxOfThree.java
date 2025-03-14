package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args){

        int a,b,c;
        a = 2;
        b = 2;
        c = 5;

        if(a > b && a > c){

            System.out.println( a + " est plus grand que => "+ b + " et " + c);
        }
        else if ( b > a && b > c) {

            System.out.println( b + " est plus grand que => "+ a + " et " + c);
        }
        else if ( c > a && c > b) {

            System.out.println( c + " est plus grand que => "+ a + " et " + b);
        }
        else if( b == a && a > c){

            System.out.println( a + " et " + b + " sont égaux et plus grand que => "+ c);
        }
        else if( c == b && b > a){

            System.out.println(b + " et " + c + " sont égaux et plus grand que => "+ a);
        }
        else if( a == c && a > b){

            System.out.println( a + " et " + c + " sont égaux et plus grand que => "+ b);
        }
        System.err.println();
        else{

            System.out.println("les trois sont égaux");
        }
    }
}
