package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String brand = "Ferrari";
    String color = "Rouge";
    String model = "F458";
    double price = 260000;
    double odometre = 1000  ;

    String serialNumber;

    public double run(double distance){
        System.out.println("La voiture roule pendant " + distance + "kilomètres");
        odometre += distance;
        return distance;
    }
}
