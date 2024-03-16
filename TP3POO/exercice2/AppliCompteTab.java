package TP3POO.exercice2;

import java.util.Scanner;
import TP3POO.exercice1.CompteBancaire;

public class AppliCompteTab {
    public static void main(String[] args) {
//PARTIE 03
        Scanner sc = new Scanner(System.in);
//Déclarer et créer un tableau de CompteBancaire en lisant la taille à partir du clavier, 
   System.out.println("Entrez la taille du tableau de Comptes :");
   int taille = sc.nextInt();
   sc.nextLine();
   
   CompteBancaire [] CompteBancaire = new CompteBancaire[taille];


//Lire le tableau de CompteBancaire (remplissage à partir du clavier), 
for (int i = 0; i < CompteBancaire.length; i++) {
    CompteBancaire[i] = new CompteBancaire();
    System.out.println("Entrez les détails pour le compte " + (i + 1) + ":");
    System.out.println("Numéro de compte :");
    CompteBancaire[i].setNumCompte(sc.nextInt()); 
    sc.nextLine(); 
    System.out.println("Nom du client :");
    CompteBancaire[i].nomClient = sc.next();
    sc.nextLine(); 
    System.out.println("Prénom du client :");
    CompteBancaire[i].prenomClient= sc.next();
    sc.nextLine(); 
    System.out.println("Solde :");
    CompteBancaire[i].solde= sc.nextDouble();
    sc.nextLine(); 
    System.out.println("Type de compte :");
    CompteBancaire[i].typeCompte= sc.next();
    sc.nextLine();
     
   }

//Affichage du tableau de CompteBancaire avec un for classique
System.out.println("\nAffichage du tableau de Comptes avec un for classique :");
        for (int i = 0; i < CompteBancaire.length; i++) {
            System.out.println(CompteBancaire[i].toString());
        }


        System.out.println("\n");

//Affichage du tableau de CompteBancaire  un for étendu
System.out.println("Affichage du tableau de CompteBancaire avec un for étendu :");
        for (CompteBancaire compte :CompteBancaire) {
            System.out.println(compte.toString());
        }        

sc.close();    
}
}
