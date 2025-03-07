package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String [] args) {
        //
        double salary = 34000;
        double salaryBeforTaxe = salary;
        double abattement = 0.9;
        salary *= abattement;
        double taxPayed = 0;
        double taxe41 = (180294 - 83824) * 0.41;
        double taxe30 = (83823 - 29316) * 0.3;
        double taxe11 = (29315 - 11498) * 0.11;

        if (salary > 180294) {
            taxPayed += (salary - 180295) * 0.45;
            taxPayed += taxe41;
            taxPayed += taxe30;
            taxPayed += taxe11;
        }

        if (salary <= 180294 && salary >= 83824) {
            taxPayed += (salary - 83824) * 0.41;
            taxPayed += taxe30;
            taxPayed += taxe11;
        }

        if (salary < 83824 && salary > 29316) {
            taxPayed += (salary - 29316) * 0.3;
            taxPayed += taxe11;
        }

        if (salary < 29316 && salary > 11498) {
            taxPayed += (salary - 11498) * 0.11;
        }

        System.out.println("Vous avez touché " + salaryBeforTaxe + " et " + salary + " était imposable.\nSur ce vous avez payé "
                + taxPayed);


    }
}