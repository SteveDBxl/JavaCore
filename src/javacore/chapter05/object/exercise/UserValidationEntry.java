package javacore.chapter05.object.exercise;

import javacore.chapter01.variable.exercise.SalaryForecast;

import java.util.Scanner;

public class UserValidationEntry {


    public static void main(String[] args){

        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel jour sommes nous?" );

        do{
            day = sc.next();

        }while(day != "lundi" || day !=  "mardi" || day !=  "mercredi" || day !=  "jeudi" || day != "vendredi" || day != "samedi" || day !=  "dimanche");
    }
}
