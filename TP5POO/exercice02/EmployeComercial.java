package TP5POO.exercice02;


//classe intermédiaire
public class EmployeComercial extends Employe {
    protected double chiffreAffaire;

    public EmployeComercial ( ) {}

    public EmployeComercial (String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }
    
}
