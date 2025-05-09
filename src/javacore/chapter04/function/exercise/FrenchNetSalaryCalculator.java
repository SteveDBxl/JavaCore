package javacore.chapter04.function.exercise;

public class FrenchNetSalaryCalculator {

    static double calculateAnnualGrossSalary(double hourlyGrossSalary){

        return (hourlyGrossSalary * 35 * 52) ;
    }

    static double applySocialCharges(double annualGrossSalary, double socialChargePercentage){

        return annualGrossSalary * (1 - socialChargePercentage);
    }

    static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage){
        return (annualNetSalary *  taxAllowancePercentage);
    }

    static double applyRevenueTax(double annualNetSalary){
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

        double salary = 34000;
        double salaryBeforTaxe = salary;
        double abattement = 0.9;
        double ouvrier = 0.23;
        double employe = 0.25;
        double smic = 11.07;
        double median = 17.5;
        double moyen = 22.5;
        double riche = 35;
        double annualGrossSalary;
        double annualNetSalary;
        double afterTaxSalary;


        annualGrossSalary =  calculateAnnualGrossSalary(riche);
        System.out.println(annualGrossSalary);

        annualNetSalary = applySocialCharges(annualGrossSalary, ouvrier);
        System.out.println(annualNetSalary);

        afterTaxSalary = applyTaxAllowance(annualNetSalary, abattement);
        System.out.println(afterTaxSalary);

        System.out.println(applyRevenueTax(afterTaxSalary));

        //System.out.println("Vous avez touché " + salaryBeforTaxe + " et " + salary + " était imposable.\nSur ce vous avez payé "
         //       );

    }
}
