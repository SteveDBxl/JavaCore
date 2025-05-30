package javacore.chapter05.object.exercise;

import javacore.chapter01.variable.exercise.SalaryForecast;

import java.util.Locale;
import java.util.Scanner;

public class UserValidationEntry {

    String day;

    public void setDay(String day){
        this.day = day;
    }

    public static void main(String[] args){

        UserValidationEntry day = new UserValidationEntry();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel jour sommes nous?" );

        do{
            day.day = sc.next().toLowerCase(Locale.ROOT);
        }while(!day.day.equals("lundi")  && !day.day.equals("mardi")  && !day.day.equals("mercredi")  && !day.day.equals("jeudi")  && !day.day.equals("vendredi")  && !day.day.equals("samedi")  && !day.day.equals("dimanche") );
    }
}
