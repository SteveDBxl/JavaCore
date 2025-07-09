package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyzer {

    int numberOfGrade;
    int grade;
    int [] schoolReport;

    public GradesAnalyzer(){

        this.schoolReport = new int[2];
    }

    public int[] newSchoolReport(int[] schoolReport){
        //changement par this.schoolReport
        this.schoolReport = new int[schoolReport.length + 1 ];

        for(int index = 0; index < schoolReport.length; index++){

            this.schoolReport[index] = schoolReport[index];
        }

        return this.schoolReport;
    }

    public boolean possibilityOfDone(String word){
        switch(word.trim()){
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
        int index = 0;
        String done = "false";

        Scanner sc = new Scanner(System.in);
        GradesAnalyzer ga = new GradesAnalyzer();

        int [] gradeReport = new int[ga.schoolReport.length];

        //modif comparaison sur gradeReport.length plutot que ga.schoolReport.length
        while(index < gradeReport.length && !ga.possibilityOfDone(done)){
            System.out.println("Quelle est la note que vous voulez rentrer?");

            gradeReport[index] = sc.nextInt();
            if(ga.verifyGradeLadder(gradeReport[index])) {
                index++;
                System.out.println("Avez vous fini?");
                done = sc.next();
            }
            else
            {
                System.out.println("note rentrée non correspondante aux attentes");
            }
            //agrandissement du tableau fonction de l'index minimum et si on a des notes encore à entrer
            if(index >= 2 && !ga.possibilityOfDone(done)){
                gradeReport = ga.newSchoolReport(gradeReport);
            }
        }
    }
}
