package javacore.chapter05.object.exercise;

import java.sql.Ref;
import java.util.concurrent.locks.ReentrantLock;

public class ReferenceManipulation {

    String name;
    int counter;

    public ReferenceManipulation(String name){
        this.name = name;
        this.counter = 0;
    }

    public void displayReferenceName(){
        System.out.println("Nom : " + this.name +"\nValeur compteur : " + this.counter);
    }

    public static void updateCounter(ReferenceManipulation object){
        object.counter++;
    }

    public static void main(String[] args){

        ReferenceManipulation reference1 = new ReferenceManipulation("reference1");

        reference1.displayReferenceName();

        ReferenceManipulation copy1 = reference1;

        copy1.displayReferenceName();

        ReferenceManipulation.updateCounter(reference1);

        reference1.displayReferenceName();

        copy1.displayReferenceName();

        ReferenceManipulation.updateCounter(copy1);

        reference1.displayReferenceName();

        copy1.displayReferenceName();

        copy1 = new ReferenceManipulation("Reference2");

        reference1.displayReferenceName();

        copy1.displayReferenceName();

        reference1 = new ReferenceManipulation("reference1");

        reference1.displayReferenceName();
    }
}
