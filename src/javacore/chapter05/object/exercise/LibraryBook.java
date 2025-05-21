package javacore.chapter05.object.exercise;

public class LibraryBook {

    String titre = "silmarillion";
    String auteur = "J.R.R. Tolkien";
    String  isnb = "9782266121026";
    int publishingYear = 1977;
    boolean available = true;

    public void getInformation(){

        System.out.println("Titre :" + this.titre + "\nAuteur : " + this.auteur + "\nAnnée de publication : " +this.publishingYear
    + "\nDisponible : " + (this.available?"oui" : "non" + "\nISBN ): " + this.isnb));
    }

    public static void main(String[]args){
        LibraryBook book = new LibraryBook();
        book.getInformation();
    }
}
