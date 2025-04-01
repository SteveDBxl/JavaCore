package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {
    public static void main(String[] args){

                //0, 21,52,113;
                int totalBill =10;
                int amountPaid =257;

                System.out.println("A remettre : " + (amountPaid-totalBill));

                //ce sont les valeurs
                int fwhilety = 50;
                int twenty = 20;
                int ten =10;
                int five = 5;
                int two = 2;
                int one =1;

                int nombreDeDistribution = 0;

                int stillRemainToGiveBack = amountPaid - totalBill;

                int remainOnFwhilety = stillRemainToGiveBack / fwhilety;

                while(stillRemainToGiveBack >= fwhilety){
                    stillRemainToGiveBack -= fwhilety;
                    nombreDeDistribution++;
                }

               System.out.println(nombreDeDistribution + " x " +fwhilety);
                nombreDeDistribution = 0;

                while(stillRemainToGiveBack >= twenty){
                    stillRemainToGiveBack -= twenty;
                    nombreDeDistribution++;
                }
               System.out.println(nombreDeDistribution + " x " + twenty);
                nombreDeDistribution = 0;

                while(stillRemainToGiveBack >= ten){
                    stillRemainToGiveBack -= ten;
                    nombreDeDistribution++;
                }
                System.out.println(nombreDeDistribution   + " x "+ ten);
                nombreDeDistribution = 0;

                while(stillRemainToGiveBack >= five){
                    stillRemainToGiveBack -= five ;
                    nombreDeDistribution++;
                }
                System.out.println(nombreDeDistribution + " x " + five);
                nombreDeDistribution = 0;

                while(stillRemainToGiveBack >= two){
                    stillRemainToGiveBack -= two;
                    nombreDeDistribution++;
                }
                System.out.println(nombreDeDistribution + " x " + two);
                nombreDeDistribution = 0;

                while(stillRemainToGiveBack >= one){
                    stillRemainToGiveBack -= one;
                    nombreDeDistribution++;
                }
                System.out.println(nombreDeDistribution + " x " + one);

    }
}
