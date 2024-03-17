package TP5POO.Exercice01;

public class Classe_Principale {
    public static void main(String[] args) {

        //Créer deux habitations : individuelle h1 et professionnelle h2 
        HabitationIndividuelle h1 = new HabitationIndividuelle("Benaicha Chahinez", "Akbou" , 64, 4, false );
        HabitationProfessionnelle h2 = new HabitationProfessionnelle("Chalabi Assia" , "la ville" , 100 ,20);
        
        //Calculer l’impôt de h1 et h2
        System.out.println("l'impot de " +h1.propriétaire+" est :"+h1.impot());
        System.out.println("l'impot de " +h2.propriétaire+" est :"+h2.impot());

        System.out.println("\n\n");

        //Afficher les informations de h1et h2
        System.out.println("les informations de h1 :");
        h1.afficher();
        System.out.println("l'impot de " +h1.propriétaire+" est :"+h1.impot());
        System.out.println("\n\n");

        System.out.println("les informations de h2 :");
        h2.afficher();
        System.out.println("l'impot de " +h2.propriétaire+" est :"+h2.impot());


    }
    
}
