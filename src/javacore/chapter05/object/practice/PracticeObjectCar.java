package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String brand = "Ferrari";
    String color = "Rouge";
    String model = "F458";
    String serialNumber;
    double price = 260000;
    double odometre = 1000  ;
    //initialisé à flase car à la construction, et par défaut, le moteur n'est pas en état d'action
    //on viendra le modifier ou le checker en fonction de certaine action
    boolean isEngineStarted = false;



    public PracticeObjectCar(String serialNumber, String brand, String model, String color, double price){
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.isEngineStarted = false;

        this.displayInformation();
    }

    public void startingEngine(){
        isEngineStarted =true;
    }

    public boolean checkIfEnginStarted(){
        return this.isEngineStarted;
    }

    public double run(double distance){
        if (!this.checkIfEnginStarted()){
            this.startingEngine();
        }
        System.out.println("La voiture roule pendant " + distance + "kilomètres");
        odometre += distance;
        return distance;
    }

    public void displayInformation(){
        System.out.println("N° de série : " + this.serialNumber + "\nMarque : " + this.brand + "\nModèle : " + this.model + "\nCouleur : " + this.color + "\n" +
                "Prix : " + this.price);
    }
}
