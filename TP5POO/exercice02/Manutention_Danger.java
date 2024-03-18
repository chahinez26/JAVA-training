package TP5POO.exercice02;


public class Manutention_Danger extends Manutentionnaire implements EmployeARisque{

    public Manutention_Danger(String nom, String prenom, int age, String dateEntree, int nbHeure) {
        super(nom, prenom, age, dateEntree,nbHeure);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrimeRisque();
    }
}
