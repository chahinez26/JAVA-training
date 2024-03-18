package TP5POO.exercice02;

import java.util.Date;

public class Technicien extends Employe{
    private int nombreUnite;

    public Technicien( ) {}

    public Technicien(String nom, String prenom, int age, Date dateEntree, int nombreUnite) {
        super(nom, prenom, age, dateEntree);
        this.nombreUnite = nombreUnite;
    }

    @Override
    public double calculerSalaire() {
        return nombreUnite * 5 ; 
    }

    public int getnombreUnites(){
        return nombreUnite;
    }
}
