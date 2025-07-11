package javacore.chapter05.object.exercise;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {

    int numberToFind;
    int essaiMax;
    int essai;
    Scanner scanner;

    public MysteryNumberGame(int essaiMax){

        numberToFind = new Random().nextInt(101);
        this.essaiMax = essaiMax;
        this.essai = essaiMax;
        this.scanner = new Scanner(System.in);
    }

    public void jouer() {

        System.out.println("J'ai choisi un nombre entre 0 et 100. À vous de deviner !");
        System.out.println("Vous avez " + essaiMax + " tentatives.");

        boolean trouve = false;

        while (essai > 0 && !trouve) {

            int proposition = getUserInput();

            if (proposition == numberToFind) {
                System.out.println("Bravo ! Vous avez deviné le nombre !");
                trouve = true;
            } else if (proposition < numberToFind) {
                System.out.println("C'est plus grand !");
            } else {
                System.out.println("C'est plus petit !");
            }

            essai--;

            if (!trouve && essai > 0) {

                System.out.println("Il vous reste " + essai + " tentative(s).");
            }
        }

        if (!trouve) {

            System.out.println("Dommage, le nombre était : " + numberToFind);
        }

    }

    private int getUserInput() {

        boolean good = false;
        int number = 0;

        while(!good){
            System.out.println("veuillez saisir un nombre");
            String entry = scanner.nextLine();
            try{
                number = Integer.parseInt(entry);
                good = true;
            }catch(NumberFormatException e){
                System.out.println("Mauvaise entrée!!!");
            }
        }

        return number;

    }

    public static void main(String[]args){

        MysteryNumberGame mg = new MysteryNumberGame(7);
        mg.jouer();
    }
}
