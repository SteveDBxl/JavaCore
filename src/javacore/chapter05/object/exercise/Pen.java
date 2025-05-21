package javacore.chapter05.object.exercise;




public class Pen {
    String nom = "Stylo";
    String couleur = "Bleu";
    String fabricant = "Bic";
    double prix = 2.5;
    int poid = 15;
    int quantite = 10;

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