package Exercice01;

public class HabitationIndividuelle extends Habitation {
    int nbPieces;
    boolean piscine;

    public HabitationIndividuelle(String proprietaire, String adresse, double surface,int nbPieces, boolean piscine) {
        super(proprietaire,adresse,surface);
        this.nbPieces = nbPieces;
        this.piscine = piscine;
    }

    // Redéfinition de la méthode impot()
    @Override
        public double impot() {
            double impot = super.impot(); 
            impot += nbPieces * 1000; // Ajout de 1000 DA par pièce
    
            if (piscine) {
                impot += 5000; // Ajout de 5000 DA si piscine présente
            }
    
            return impot;
        }

    

    // Redéfinition de la méthode afficher()
        @Override
        void afficher() {
        super.afficher();
        System.out.println("Nombre de pièces : " + nbPieces);
        System.out.println("Présence de piscine: " + (piscine ? "Oui" : "Non"));

       }




    
}
