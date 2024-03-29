package TP5POO.exercice02;



public class Production_Danger extends Technicien implements EmployeARisque{

    public Production_Danger(String nom, String prenom, int age, String dateEntree, int nbUnitesProduites) {
        super(nom, prenom, age, dateEntree, nbUnitesProduites);
    }

    // Redéfinition de la méthode calculerSalaire pour inclure la prime de risque
    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrimeRisque();
    }
}
    

