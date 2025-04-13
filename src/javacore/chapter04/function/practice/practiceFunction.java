package javacore.chapter04.function.practice;

public class practiceFunction {

    public static void main(String[] args){

        int test = 0;
        test();

        if(true){
            System.out.println("affichage du if true");
            //int test = 0; already define in the scope of main
        }
    }
    public static void test(){
        System.out.println("affichage de la fonction test!!");
        int test = 0;
    }
}
