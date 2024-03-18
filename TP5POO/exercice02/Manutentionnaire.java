package TP5POO.exercice02;
import java.util.Date;

public class Manutentionnaire extends Employe{
    private int nbHeure;

    public Manutentionnaire( ) {}

    public Manutentionnaire(String nom, String prenom, int age, Date dateEntree, int nbHeure) {
        super(nom, prenom, age, dateEntree);
        this.nbHeure = nbHeure;
    }


    @Override
    public double calculerSalaire(){
        return nbHeure * 650;
    
    }

    public int getNbHeure(){
        return nbHeure;
    }
}   
