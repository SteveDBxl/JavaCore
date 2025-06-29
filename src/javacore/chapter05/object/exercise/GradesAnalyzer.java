package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyzer {

    int numberOfGrade;
    int grade;
    int [] schoolReport;

    public GradesAnalyzer(){

        this.schoolReport = new int[2];
    }

    public boolean possibilityOfDone(String word){
        switch(word){
            case "oui" :
                return true;

            case "true" :
                return true;

            case "yes" :
                return true;

            default :
                return false;

        }
    }

    public void setGrade(int [] schoolReport){
        int index = 0;
        String done = "";
        Scanner sc = new Scanner(System.in);

        while(index < 30 || possibilityOfDone(done)){
            this.schoolReport[index] = schoolReport[index];
            index++;
            System.out.println("Avez vous fini?");
            done = sc.next();

        }
    }

    public boolean verifyGradeLadder(int grade){
        if(grade <= 20 && grade > 0){
            return true;
        }
        return false;
    }

    public static double getAverage(int[] gradesArray){
        double sum = 0;

        for(int grade : gradesArray){
            sum += grade;
        }
        return sum / gradesArray.length;
    }

    public static double getMinGrade(int[] gradesArray){
        int min = 0;

        for(int grade : gradesArray){
            if(grade < min){
                min = grade;
            }
        }
        return min;
    }

    public static double getMaxGrade(int[] gradesArray){

        int max = 0;
        for(int grade : gradesArray){
            if(grade > max){
                max = grade;
            }
        }
        return max;
    }

    public static int getGradeCountAboveThreshold(int[] gradesArray, int threshold){
        int above = 0;

        for(int grade : gradesArray){
            if(grade > threshold){
                above++;
            }
        }
        return above;
    }

    public static int getGradeCountBetweenRange(int[] gradesArray, int from, int to){
        int inRange = 0;

        for(int grade : gradesArray) {
            if(grade >= from && grade <= to){
                inRange++;
            }
        }
        return inRange;
    }

    public void displayInPercentage(int numberOfGradeCorresponding, int numberOfGradeTotal){
        System.out.println("Nombre de notes correspondant " + numberOfGradeCorresponding + " sur "
                + numberOfGradeTotal + " ce qui fait : " + (numberOfGradeCorresponding / numberOfGradeTotal) * 100 + "%");
    }

    public static void main(String [] args){

        int numberOfGrade;
        int grade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de note voulez vous rentrer?");
        GradesAnalyzer ga = new GradesAnalyzer();

        int [] gradeReport = new int[ga.schoolReport.length];
        int index = 0;
        String done = "false";

        while(index < ga.schoolReport.length && ga.possibilityOfDone(done)){
            System.out.println("Quelle est la note que vous voulez rentrer?");
            gradeReport[index] = sc.nextInt();
            if(ga.verifyGradeLadder(gradeReport[index])) {
                index++;
                System.out.println("Avez vous fini?");
                done = sc.next();
                ga.schoolReport = new int[ga.schoolReport.length + 1];
            }
            else
            {
                System.out.println("note rentrée non correspondante aux attentes");
            }

        }
    }
}
