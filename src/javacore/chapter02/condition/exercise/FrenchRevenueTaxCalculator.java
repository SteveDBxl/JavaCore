package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String [] args) {
        //
        double salary = 34000;
        //boolean cadre = true;

        double salaryBeforTaxe = salary;
        double abattement = 0.9;
        double taxPayed = 0;
        salary *= abattement;

            if (salary > 180294) {
                taxPayed += (salary - 180295) * 0.45;
                taxPayed += (180294 - 83824) * 0.41;
                taxPayed += (83823 - 29316) * 0.3;
                taxPayed += (29315 - 11498) * 0.11;

            }

            if (salary <= 180294 && salary >= 83824) {
                taxPayed += (salary - 83824) * 0.41;
                taxPayed += (83823 - 29316) * 0.3;
                taxPayed += (29315 - 11498) * 0.11;
            }

            if (salary < 83824 && salary > 29316) {
                taxPayed += (salary - 29316) * 0.3;
                taxPayed += (29315 - 11498) * 0.11;
            }

            if (salary < 29316 && salary > 11498) {
                taxPayed += (salary - 11498) * 0.11;
            }

        System.out.println("Vous avez touché " + salaryBeforTaxe + " et " + salary + " était imposable.\nSur ce vous avez payé " +
                taxPayed);
    }
}