package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args){

        int a,b,c;
        a = 2;
        b = 2;
        c = 2;


        if(a > b && a > c){

            System.out.println( a + " est plus grand que => "+ b + " et " + c);
        }
        else if ( b > a && b > c) {

            System.out.println( b + " est plus grand que => "+ a + " et " + c);
        }
        else if ( c > a && c > b) {

            System.out.println( c + " est plus grand que => "+ a + " et " + b);
        }
        else if( b == a ){

            System.err.println( a + " et " + b + " sont égaux ");
        }
        else if( c == b ){

            System.err.println(b + " et " + c + " sont égaux  ");
        }
        else if( a == c ){

            System.err.println( a + " et " + c + " sont égaux ");
        }

        else{
            System.err.println("Toutes les valeurs sont égales, il n'y a en pas une plus grande que les autres.");
        }
    }
}
