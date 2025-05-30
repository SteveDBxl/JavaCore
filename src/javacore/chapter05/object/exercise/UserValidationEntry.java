package javacore.chapter05.object.exercise;

import javacore.chapter01.variable.exercise.SalaryForecast;

import java.util.Locale;
import java.util.Scanner;

public class UserValidationEntry {


    public static void main(String[] args){

        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel jour sommes nous?" );

        do{
            day = sc.next().toLowerCase(Locale.ROOT);
        }while(!day.equals("lundi")  && !day.equals("mardi")  && !day.equals("mercredi")  && !day.equals("jeudi")  && !day.equals("vendredi")  && !day.equals("samedi")  && !day.equals("dimanche") );
    }
}
