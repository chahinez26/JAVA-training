package TP4POO.exercice3;

public class AppliRepertoire {
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire(5);

    repertoire.addAbonne("chahinez", "123456789");
    repertoire.addAbonne("islam", "987654321");
    repertoire.addAbonne("djahid", "555555555");
    
    // Test des méthodes
    System.out.println("Numéro de chahinez : " + repertoire.getNumero("chahinez"));

    System.out.println("Nombre d'abonnés : " + repertoire.getNAbonnes());

    System.out.println("Abonné à l'index 3 : " + repertoire.getAbonne(2));

    System.out.println("Afficher le repertoire triée par ordre alphabetique: ");
    Abonne [] abonneTrie = repertoire.getAbonnesTries();
    
    for (int i = 0; i<abonneTrie.length; i++)
    {
        System.out.println(abonneTrie[i]);
    }
    
    }
}
