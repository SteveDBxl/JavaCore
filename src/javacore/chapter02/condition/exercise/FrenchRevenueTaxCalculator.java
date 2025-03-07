package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String [] args) {
        //
        double salary = 28899;
        boolean cadre = true;
        boolean ouvrier = false;
        double abattement = 0.9;

        if (ouvrier)
        {
            salary*=0.77*abattement;
            System.out.println("En tant qu'ouvrier ");
            if (salary > 177106) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.55 + " ce qui fait que vous avez payé "
                        + salary * 0.45 + " d'impot(s), soit 45%");
            }
            if (salary <= 177106 && salary >= 82342) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.59 + " ce qui fait que vous avez payé "
                        + salary * 0.41 + " d'impot(s) soit 41%");
            }
            if (salary < 82342 && salary > 28798) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.70 + " ce qui fait que vous avez payé "
                        + salary * 0.3 + " d'impot(s) soit 30%");
            }
            if (salary < 28798 && salary > 11264) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.89 + " ce qui fait que vous avez payé "
                        + salary * 0.11 + " d'impot(s) soit 11%");
            }
            if (salary < 11264) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary + " ce qui fait que vous avez payé "
                        + salary * 0 + " d'impot(s) soit 0%");
            }
        }
        if (cadre)
        {
            salary*=0.75*abattement;
            if (salary > 177106) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.55 + " ce qui fait que vous avez payé "
                        + salary * 0.45 + " d'impot(s), soit 45%");
            }
            if (salary <= 177106 && salary >= 82342) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.59 + " ce qui fait que vous avez payé "
                        + salary * 0.41 + " d'impot(s) soit 41%");
            }
            if (salary < 82342 && salary > 28798) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.70 + " ce qui fait que vous avez payé "
                        + salary * 0.3 + " d'impot(s) soit 30%");
            }
            if (salary < 28798 && salary > 11264) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary * 0.89 + " ce qui fait que vous avez payé "
                        + salary * 0.11 + " d'impot(s) soit 11%");
            }
            if (salary < 11264) {
                System.out.println("Pour " + salary + " imposable vous touchez " + salary + " ce qui fait que vous avez payé "
                        + salary * 0 + " d'impot(s) soit 0%");
            }
        }
    }
}
