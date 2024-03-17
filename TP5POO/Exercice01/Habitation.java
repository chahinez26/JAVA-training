package TP5POO.Exercice01;

public class Habitation {
    protected String propriétaire;
    protected String Adresse;
    protected Double surface;

    public Habitation() {}

   
    public Habitation(String prop, String Adrss, Double surf) {
        this.propriétaire = prop;
        this.Adresse = Adrss;
        this.surface = surf;
    }

    double impot(){
       return (1000 * surface); 
    }

    void afficher(){
        System.out.println(this.propriétaire);
        System.out.println(this.Adresse);
        System.out.println(this.surface);
    }

}
