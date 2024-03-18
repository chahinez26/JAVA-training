package TP5POO.exercice02;

import java.util.Date;
public class Employe {
     protected String nom;
     protected String prenom;
     protected int age;
     protected Date Date_Entree;


    public Employe (String n, String pr,int a, Date d) {
    this.nom = n;
    this.prenom = pr;
    this.age = a;
    this.Date_Entree= d;
    }

    public Employe( ){}

    public String getNom() {
        String chaine = nom+" "+prenom;
        return chaine;
    }

   public double calculerSalaire() {
         return 0;
   }   
}
