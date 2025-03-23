package javacore.chapter02.condition.exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AgeValidation {

    public static void main( String [] args){

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();       // Année courante (202X)




         System.out.println("Nous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...

        byte jour = 25;
        byte mois = 02;
        short annee = 2007;
        byte majeur = 18;

        if(currentYear - annee > majeur){

            System.out.println("vous êtes majeur");
        }
        else if( currentYear - annee == majeur && currentMonth == mois && currentDay == jour){

            System.out.println("Happy Birthday, vous évoluez en\n.\n.\n.\nMajeur");
        }
        else if(currentYear - annee == majeur && currentMonth - mois >= 0 && currentDay - jour >= 0){

            System.out.println("vous êtes majeur depuis peu!");
        }
        else{

            System.out.println("on se bouge les mineurs!");
        }

        // Version 2------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre date de naissance (YYYY-MM-DD) : ");
        String dateNaissanceStr = scanner.nextLine();

        // Conversion de la date en LocalDate
        LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr);
        LocalDate dateMajorite = dateNaissance.plusYears(18);
        LocalDate aujourdHui = LocalDate.now();

        if (aujourdHui.isBefore(dateMajorite)) {
            long joursRestants = ChronoUnit.DAYS.between(aujourdHui, dateMajorite);
            System.out.println("Il reste " + joursRestants + " jours jusqu'à votre majorité.");
        } else {
            System.out.println("Vous êtes déjà majeur(e) !");
        }

        scanner.close();


    }
}
