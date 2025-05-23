package javacore.chapter05.object.exercise;

public class LibraryBook {

    String titre;
    String auteur;
    String  isnb;
    int publishingYear;
    boolean available;

    public void getInformation(){

        System.out.println("Titre :" + this.titre + "\nAuteur : " + this.auteur + "\nAnnée de publication : " +this.publishingYear
    + "\nDisponible : " + (this.available?"oui" : "non" + "\nISBN ): " + this.isnb));
    }

    public static void main(String[]args){
        LibraryBook book = new LibraryBook();
        book.getInformation();
    }
}
