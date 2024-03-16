package TP3POO.exercice1;
import java.util.Scanner;
public class AppliCompteBancaire {
    public static void main(String[] args) {
     //PARTIE 1

        CompteBancaire compte1 = new CompteBancaire(1, "Bouakkaz", "Samra", 10000.00, "Compte Epargne");
       CompteBancaire compte2 = new CompteBancaire(2, "Aberbour", "Rima", 10000.00, "Compte Courant");
        
    
        compte1.affiche();//petit probleme ici il m'afficha numCompte= 2 pour compte1 et compte2
        System.out.println("****************************************************************");
        compte2.affiche();
        System.out.println("****************************************************************");


        System.out.println("Nombre total de comptes : " + CompteBancaire.getNombreDeComptes());
        System.out.println("****************************************************************");


        //une solution pour que la variable numCompte s’incrémente automatiquement
        Scanner sc = new Scanner(System.in);

        
        CompteBancaire compte3 = new CompteBancaire();
        compte3.affiche();
        System.out.println("****************************************************************");

 
        CompteBancaire compte4 = new CompteBancaire();
        System.out.println("\n saisissez les infos du compte 4 :");

        System.out.print("nom :   ");
        compte4.nomClient = sc.next();

        System.out.print("prenom :   ");
        compte4.prenomClient = sc.next();

        System.out.print("solde:   ");
        compte4.solde = sc.nextDouble();
        
        System.out.print("type du compte :   ");
        compte4.typeCompte = sc.next();

        compte4.affiche();
        System.out.println("****************************************************************");


    // PARTIE 2

    CompteBancaire compte5 = new CompteBancaire();
        System.out.println("\n saisissez les infos du compte 5 :");

        System.out.print("nom :   ");
        compte5.nomClient = sc.next();

        System.out.print("prenom :   ");
        compte5.prenomClient = sc.next();

        System.out.print("solde:   ");
        compte5.solde = sc.nextDouble();
        
        System.out.print("type du compte :   ");
        compte5.typeCompte = sc.next();

        compte5.affiche();
        System.out.println("****************************************************************");

        CompteBancaire compte6 = new CompteBancaire();
        compte6.nomClient= "aitmehdi" ;
        compte6.prenomClient = "nassira" ;
        compte6.solde = 1000007 ;
        compte6.typeCompte = "compte courant";
        compte6.affiche();
        System.out.println("****************************************************************");

        sc.close();
        
        //PARTIE 04

        // Tester l’affichage avec la méthode toString()
       System.out.println("\nAffichage avec la méthode toString() :");
        System.out.println(compte1.toString());



    }
}
