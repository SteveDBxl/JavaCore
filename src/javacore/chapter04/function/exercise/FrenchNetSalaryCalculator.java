package javacore.chapter04.function.exercise;

import java.util.Scanner;

public class FrenchNetSalaryCalculator {

    static final double TAX_41 = (180294 - 83824) * 0.41;
    static final double TAX_3 = (83823 - 29316) * 0.3;
    static final double TAX_11 = (29315 - 11498) * 0.11;
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

        if (annualNetSalary > 180294) {
            taxPayed += (annualNetSalary - 180295) * 0.45;
            annualNetSalary = annualNetSalary - (annualNetSalary - 180295);
        }

        if (annualNetSalary >= 83824) {
            taxPayed += (annualNetSalary - 83824) * 0.41;
            annualNetSalary = annualNetSalary - (annualNetSalary - 180294);
        }

        if (annualNetSalary >= 29316) {
            taxPayed += (annualNetSalary - 29316) * 0.3;
            annualNetSalary = annualNetSalary - (annualNetSalary - 83824);
        }
        if (annualNetSalary >= 11498) {
            taxPayed += (annualNetSalary - 11498) * 0.11;

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

        //System.out.println("Vous avez touché " + salaryBeforTaxe + " et " + salary + " était imposable.\nSur ce vous avez payé "
         //       );

    }
}
