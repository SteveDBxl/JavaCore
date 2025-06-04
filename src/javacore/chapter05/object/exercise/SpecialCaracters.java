package javacore.chapter05.object.exercise;

public class SpecialCaracters {

    String welcomeText = "Bonjour, je m'appel Steve mais tu peux m'appeler\"Steve\"! \n/!\\Attention aux erreurs\t aussi" ;
    String tabulation = "\t";
    String jumpLine = "\n";


    public static void main(String[] args){

        SpecialCaracters sc = new SpecialCaracters();

        System.out.println(sc.welcomeText);
        System.out.println(sc.jumpLine);
        System.out.print("1");
        System.out.print(sc.jumpLine);
        System.out.print(sc.tabulation);
        System.out.print("2");
    }
}
