package javacore.chapter05.object.exercise;
import javacore.chapter03.loop.exercise.BasicStopwatch;

import static java.lang.Thread.sleep;

public class BasicStopwatchV2 {

    int seconde = 0;
    int minutes = 0;
    int heures = 0;
    String nom;

    public BasicStopwatchV2(String nom){
        this.nom = nom;
    }

    public void launch() throws InterruptedException{

        this.seconde++;
        if(seconde >= 60){
            minutes++;
            seconde = 0;
        }
        if(minutes >= 60){
            heures++;
            minutes = 0;
        }
        sleep(1000);
    }

    public void displayInfo(){
        System.out.print(this.nom + " : ");

        if(this.heures < 10){
            System.out.print("0" + this.heures + " : ");
        }
        else{
            System.out.print(this.heures + " : ");
        }
        if(this.minutes < 10){
            System.out.print("0" + this.minutes + " : ");
        }
        else{
            System.out.print(this.minutes +" : ");
        }
        if(this.seconde < 10){
            System.out.print("0" + this.seconde);
        }
        else{
            System.out.print(this.seconde);
        }
        System.out.print("\r");

    }
    public static void main(String args[]){
        BasicStopwatchV2 watch = new BasicStopwatchV2("Oeuf Dur");


        try {
            while (true) {
                watch.launch();
                watch.displayInfo();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
