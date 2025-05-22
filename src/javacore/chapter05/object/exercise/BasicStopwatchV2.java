package javacore.chapter05.object.exercise;
import javacore.chapter03.loop.exercise.BasicStopwatch;

import static java.lang.Thread.sleep;

public class BasicStopwatchV2 {

    int seconde = 0;
    int minutes = 0;
    int heures = 0;

    public void launch() throws InterruptedException{
        sleep(200);
        this.seconde++;
        if(seconde >= 60){
            this.minutes = seconde / 60;
        }
        seconde %= 60;
    }

    public void displayTime(){
        System.out.println(this.heures + " :" + this.minutes + " :" + this.seconde);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String args[]){
        BasicStopwatchV2 watch = new BasicStopwatchV2();

        try {
            while (true) {
                watch.launch();
                watch.displayTime();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
