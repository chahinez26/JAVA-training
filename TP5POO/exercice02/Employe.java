package TP5POO.exercice02;

public class Employe {
     protected String nom;
     protected String prenom;
     protected int age;
     protected String Date_Entree;


    public Employe (String n, String pr,int a, String d) {
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
