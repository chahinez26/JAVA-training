package TP5POO.exercice02;
import java.util.ArrayList;



    public class Personnel {
        private ArrayList<Employe> listeEmployes;
    
        // Constructeur
        public Personnel() {
            listeEmployes = new ArrayList<>();
        }
    
        // Méthode pour ajouter un employé à la collection
        public void ajouterEmploye(Employe employe) {
            listeEmployes.add(employe);
        }
    
        // Méthode pour calculer le salaire de chacun des employés de la collection
        public void calculerSalaires() {
            System.out.println("Salaires de tous les employés :");
            for (Employe employe : listeEmployes) {
                System.out.println(employe.getNom() + " : " + employe.calculerSalaire() + " DA");
            }
        }
    
        // Méthode pour calculer le salaire moyen des employés de la collection
        public double salaireMoyen() {
            double totalSalaires = 0;
            for (Employe employe : listeEmployes) {
                totalSalaires += employe.calculerSalaire();
            }
            return totalSalaires / listeEmployes.size();
        }
    }


