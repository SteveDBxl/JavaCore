package javacore.chapter01.variable.exercise;

public class
SalaryForecast {
    public static void main(String []args)
    {
        byte tauxHoraire = 25;
        float tempTravailJour = 7.7f;
        float tempTravailSemaine = 38.5f;

        float cotisationCadre = 1 - 0.25f;
        float impotRevenu = 0.895f;

        float brutJour = tauxHoraire * tempTravailJour;
        float brutSemaine = tauxHoraire * tempTravailSemaine;
        float brutMensuel = brutSemaine * 4;
        float brutAnnuel = brutMensuel * 12;
        float netImposableMensuel = brutMensuel * cotisationCadre;
        float netImposableAnnuel = brutAnnuel * cotisationCadre;
        float netMensuel = netImposableMensuel * impotRevenu;
        float netAnnuel = netImposableAnnuel * impotRevenu;

        System.out.println("Salaire brut journalier : " + brutJour + "\nSalaire brut hebdo : " + brutSemaine + "\nSalaire brut mensuel : " + brutMensuel);
        System.out.println("Salaire brut annuel : " + brutAnnuel + "\nSalaire net imposable mensuel : " + netImposableMensuel + "\nSalaire net imposable annuel : " + netImposableAnnuel);
        System.out.println("Salaire net mensuel : " + netMensuel + "\nSalaire net annuel : " + netAnnuel);



    }
}
