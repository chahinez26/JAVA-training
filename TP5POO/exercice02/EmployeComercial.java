package TP5POO.exercice02;
import java.util.Date;


//classe intermédiaire
public class EmployeComercial extends Employe {
    protected double chiffreAffaire;

    public EmployeComercial ( ) {}

    public EmployeComercial (String nom, String prenom, int age, Date dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }
    
}
