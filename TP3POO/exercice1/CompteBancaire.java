package TP3POO.exercice1;
import java.lang.String;

public class CompteBancaire {
      public static int nombreDeComptes = 0;
      private int numCompte;

      public String nomClient;
      public String prenomClient;
      public double solde;
      public static final String nomBanque = "AL-BARAKA" ;
      public static final String codeAgence = "AGENCE-CODE-107";
      public String typeCompte;

      


      public CompteBancaire () {
        nombreDeComptes ++;
      }

      CompteBancaire (int numC , String nomC , String prenomC ,double s ,  String type )
      {
             this.numCompte = numC;
             this.nomClient = nomC;
             this.prenomClient = prenomC;
             this.solde = s;
             this.typeCompte = type; 
             nombreDeComptes ++;
      }

      public  void affiche(){
        System.out.println("les caractéristique de l'etat du compte bancaire  "+numCompte+"  sont :");  
        System.out.println("numCompte : "+numCompte);
        System.out.println("nomClient : "+nomClient);
        System.out.println("prenomClient : "+prenomClient);
        System.out.println("solde : "+solde);
        System.out.println("nomBanque : "+nomBanque);
        System.out.println("codeAgence : "+codeAgence);
        System.out.println("typeCompte : "+typeCompte);
        System.out.println("nombreDeComptes : "+nombreDeComptes);
    }
       //une solution pour que la variable numCompte s’incrémente automatiquement
      CompteBancaire ( String nomC , String prenomC ,double s ,  String type )
      {
             numCompte++;
             nomClient = nomC;
             prenomClient = prenomC;
             solde = s;
             typeCompte = type; 
             nombreDeComptes++;

      }

      public static int getNombreDeComptes() {
            return nombreDeComptes;
        }

       public int getNumCompte(){
            return numCompte;
       }
       
       public void setNumCompte(int numC){
            this.numCompte = numC;
       }

       public String toString() {
        return( "Numéro de compte : " + numCompte + "\n" +
               "Nom du client : " + nomClient + "\n" +
               "Prénom du client : " + prenomClient + "\n" +
               "Solde : " + solde + "\n" +
               "Nom de la banque : " + nomBanque + "\n" +
               "Code de l'agence : " + codeAgence + "\n" +
               "Type de compte : " + typeCompte );
    } 
        

} 
