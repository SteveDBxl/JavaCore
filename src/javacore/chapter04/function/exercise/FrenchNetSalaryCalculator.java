package javacore.chapter04.function.exercise;

import java.util.Scanner;

public class FrenchNetSalaryCalculator {

    static final double TAX_41 = (180294 - 83824) * 0.41;
    static final double TAX_30 = (83823 - 29316) * 0.3;
    static final double TAX_11 = (29315 - 11498) * 0.11;
    static final int UPPERTAXBRACKET = 180294;
    static final int SECONDTAXBRACKET = 83824;
    static final int THIRDTAXBRACKET = 29316;
    static final int LOWESTTAXBRACKET = 11498;

    static double calculateAnnualGrossSalary(double hourlyGrossSalary, int numberHourAWeek, int numberWeekAYear){
        return (hourlyGrossSalary * numberHourAWeek * numberWeekAYear) ;
    }

    static double applySocialCharges(double annualGrossSalary, double socialChargePercentage){
        return annualGrossSalary * socialChargePercentage;
    }

    static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage){
        return annualNetSalary *  taxAllowancePercentage;
    }

    static double applyRevenueTax(double annualNetSalary){

        double taxPayed = 0;

        if (annualNetSalary > UPPERTAXBRACKET) {
            taxPayed += (annualNetSalary - UPPERTAXBRACKET) * 0.45;
            annualNetSalary =  UPPERTAXBRACKET;
        }

        if (annualNetSalary >= SECONDTAXBRACKET) {
            taxPayed += (annualNetSalary - SECONDTAXBRACKET) * 0.41;
            annualNetSalary = SECONDTAXBRACKET;
        }

        if (annualNetSalary >= THIRDTAXBRACKET) {
            taxPayed += (annualNetSalary - THIRDTAXBRACKET) * 0.3;
            annualNetSalary = THIRDTAXBRACKET;
        }
        if (annualNetSalary >= LOWESTTAXBRACKET) {
            taxPayed += (annualNetSalary - LOWESTTAXBRACKET) * 0.11;

        }

        return taxPayed;

    }
    public static void main(String[] args){

        int numberHourAWeek;
        int numberWeekAYear;
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

        System.out.println("tax : " + applyRevenueTax(afterTaxSalary));
        System.out.println("salaire de : " + (afterTaxSalary - applyRevenueTax(afterTaxSalary)) + " après taxes");

        //System.out.println("Vous avez touché " + salaryBeforTaxe + " et " + salary + " était imposable.\nSur ce vous avez payé "
         //       );

    }
}
