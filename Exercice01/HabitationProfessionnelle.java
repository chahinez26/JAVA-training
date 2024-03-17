package Exercice01;

public class HabitationProfessionnelle extends Habitation {
    private int nbEmployes;

    public HabitationProfessionnelle (String proprietaire, String adresse, double surface ,int nb) {
        super(proprietaire,adresse,surface);
        this.nbEmployes = nb;
    }

    @Override
    void afficher() {
    super.afficher();
    System.out.println("Nombre d'employées : " + nbEmployes);
   }

   @Override
   public double impot() {
    double impot = super.impot(); 
    impot += (nbEmployes / 10) * 1000;

    return impot;
}
}
