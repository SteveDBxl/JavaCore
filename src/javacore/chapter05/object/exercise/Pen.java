package javacore.chapter05.object.exercise;




public class Pen {
    String nom;
    String couleur;
    String fabricant;
    double prix = 0;
    int poid = 0;
    int quantite;

    public void displayInformation(){
        System.out.println("Nom : " +  this.nom +" ,Couleur : " + this.couleur + " ,Prix : " + this.prix + " ,Quantité : " + this.quantite +
                " ,Fabricant : " + this.fabricant + " ,Poids : " + this.poid);
    }

    public static void main(String[] args) {

        Pen pen = new Pen();
        System.out.println("Nom : " +  pen.nom +" ,Couleur : " + pen.couleur + " ,Prix : " + pen.prix + " ,Quantité : " + pen.quantite +
                " ,Fabricant : " + pen.fabricant + " ,Poids : " + pen.poid);

        pen.displayInformation();
    }
}