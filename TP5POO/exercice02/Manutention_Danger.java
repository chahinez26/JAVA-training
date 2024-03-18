package TP5POO.exercice02;

import java.util.Date;

public class Manutention_Danger extends Manutentionnaire implements EmployeARisque{

    public Manutention_Danger(String nom, String prenom, int age, Date dateEntree, int nbHeure) {
        super(nom, prenom, age, dateEntree,nbHeure);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrimeRisque();
    }
}
