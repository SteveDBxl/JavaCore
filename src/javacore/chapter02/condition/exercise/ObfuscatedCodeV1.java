package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int typeVehicule = 1; // Type de véhicule (1 = electrique, 2 = diesel, 3 = essence)

        double distance= 100; // Distance

        boolean e = true;
        double d = 0.03;

        double coutPlein = 0;

        if (typeVehicule == 1) {
            coutPlein = distance * 0.10;
            System.out.println(coutPlein);
        }
        if (typeVehicule == 2) {
            coutPlein = distance * 0.20;
        }
        if (typeVehicule == 3) {
            coutPlein = distance * 0.35;
        }
        if (e) {
            coutPlein = coutPlein - (distance * d);
        }

        System.out.println("___________ : " + coutPlein + "€");

    }
   // view rawExerciseObfuscatedCodeV1.java hosted with ❤ by GitHub
    
}
