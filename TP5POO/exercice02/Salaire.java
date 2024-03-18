package TP5POO.exercice02;

public class Salaire {

/*Instancier la classe Personnel 
- Ajouter des employés 
- Afficher le salaire de chaque employé 
- Afficher le salaire moyen des employés */

    public static void main(String[] args) {
        // Instanciation de la classe Personnel
        Personnel personnel = new Personnel();

        // Ajout des employés
        personnel.ajouterEmploye(new Vendeur("Benaicha", "chahinez", 20, "01/01/2020", 5000)); 
        personnel.ajouterEmploye(new Representant("Benaicha", "Islam", 18, "01/01/2022", 1500));
        personnel.ajouterEmploye(new Technicien("Chalabi", "Assia", 28, "15/06/2015", 100)); 
        personnel.ajouterEmploye(new Manutentionnaire("Bibi", "hassiba", 30, "20/03/2018", 160)); 
        personnel.ajouterEmploye(new Manutention_Danger("beni", "has", 30, "20/03/2018", 200)); 
        personnel.ajouterEmploye(new Production_Danger("tarafat", "melissa", 20, "20/03/2019", 250 )); 

        //ajouter affichage de chaque employee

        
        personnel.calculerSalaires();


        System.out.println("---------------------------------");


        System.out.println("Salaire moyen des employés : " + personnel.salaireMoyen() + " DA");
    }


}
