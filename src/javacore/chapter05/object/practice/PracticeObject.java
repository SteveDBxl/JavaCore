package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main(String[] args){

        PracticeObjectCar car = new PracticeObjectCar("UEFJ85479LK", "Ferrari", "F458", "Rouge", 260000);
        car.brand = "Ferrari";
        car.model = "F458";
        car.color = "Rouge";
        car.price = 260000;
        car.odometre = 0;

String brand = "Ferrari";
String color = "Rouge";
String model = "F458";
double price = 260000;
double odometre = 21500  ;

        System.out.println("ma voiture de la marque " + brand + "et de modèle " +  model + " elle est "+  color + "et j'ai fait "+ + odometre + " avec!!!");

        car.run(1999);
        System.out.println(car.odometre);

        car.run(1);
        System.out.println(car.odometre);

    }

    public static double run(double distance)
    {
        System.out.println("la voiture roule pendant" + distance + " kilomètres");

        return distance;
    }
}
