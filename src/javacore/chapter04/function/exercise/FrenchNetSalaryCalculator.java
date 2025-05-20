package javacore.chapter04.function.exercise;

import java.util.Scanner;

public class FrenchNetSalaryCalculator {

    static double calculateAnnualGrossSalary(double hourlyGrossSalary, int numberHourAWeek, int numberWeekAYear){

        return (hourlyGrossSalary * numberHourAWeek * numberWeekAYear) ;
    }

    static double applySocialCharges(double annualGrossSalary, double socialChargePercentage){

        return annualGrossSalary * (1 - socialChargePercentage);
    }

    static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage){
        return (annualNetSalary *  taxAllowancePercentage);
    }

    static double applyRevenueTax(double annualNetSalary){
        //variable mise en final
        double taxe41 = (180294 - 83824) * 0.41;
        double taxe30 = (83823 - 29316) * 0.3;
        double taxe11 = (29315 - 11498) * 0.11;
        double taxPayed = 0;

        if (annualNetSalary > 180294) {
            taxPayed += (annualNetSalary - 180295) * 0.45;
            taxPayed += taxe41;
            taxPayed += taxe30;
            taxPayed += taxe11;

            return annualNetSalary - taxPayed;
        }

        if (annualNetSalary <= 180294 && annualNetSalary >= 83824) {
            taxPayed += (annualNetSalary - 83824) * 0.41;
            taxPayed += taxe30;
            taxPayed += taxe11;

            return annualNetSalary - taxPayed;
        }

        if (annualNetSalary < 83824 && annualNetSalary > 29316) {
            taxPayed += (annualNetSalary - 29316) * 0.3;
            taxPayed += taxe11;

            return annualNetSalary - taxPayed;
        }
        if (annualNetSalary < 29316 && annualNetSalary > 11498) {
            taxPayed += (annualNetSalary - 11498) * 0.11;

            return annualNetSalary - taxPayed;
        }

        return annualNetSalary;

    }
    public static void main(String[] args){

        int numberHourAWeek;
        int numberWeekAYear;
        double salary = 34000;
        double salaryBeforTaxe = salary;
        double tauxAbattement = 1 - 0.1;
        double cotisationSocialOuvrier = 1 - 0.23;
        double cotisationSocialCadre =  1 - 0.25;
        double tauxHoraireSmic = 11.07;
        double tauxHoraireMedian = 17.5;
        double tauxHoraireMoyen = 22.5;
        double tauxHoraireRiche = 35;
        double annualGrossSalary;
        double annualNetSalary;
        double afterTaxSalary;

        Scanner sc = new Scanner(System.in);
        System.out.println("combien d'heure travaillez vous par semaine?");
        numberHourAWeek = sc.nextInt();
        System.out.println("combien de semaine travaillez vous dans l'année");
        numberWeekAYear = sc.nextInt();

        annualGrossSalary =  calculateAnnualGrossSalary(tauxHoraireRiche, numberHourAWeek, numberWeekAYear);
        System.out.println(annualGrossSalary);

        annualNetSalary = applySocialCharges(annualGrossSalary, cotisationSocialOuvrier);
        System.out.println(annualNetSalary);

        afterTaxSalary = applyTaxAllowance(annualNetSalary, tauxAbattement);
        System.out.println(afterTaxSalary);

        System.out.println(applyRevenueTax(afterTaxSalary));

        //System.out.println("Vous avez touché " + salaryBeforTaxe + " et " + salary + " était imposable.\nSur ce vous avez payé "
         //       );

    }
}
