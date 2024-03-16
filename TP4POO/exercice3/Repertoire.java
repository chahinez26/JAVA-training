package TP4POO.exercice3;



public class Repertoire {
    private int Max , nbr_abonne;
    private Abonne repertoire[];


    //constructeur recevant un argument de type entier précisant le nombre maximum d’abonnés que pourra contenir le répertoire
    public Repertoire(int Max)
	{
		this.Max = Max;
		repertoire  = new Abonne[Max];
		nbr_abonne =0 ;
	}
    
    //méthode addAbonne permettant d’ajouter un nouvel abonné ; elle renverra la valeur false si le répertoire est plein, la valeur true sinon,
    public boolean addAbonne(String nom, String numeroTelephone) {
        if (nbr_abonne> Max) {
            return false; // Le répertoire est plein
        }

            Abonne abonne = new Abonne(nom, numeroTelephone);
            repertoire [nbr_abonne] = abonne;
            nbr_abonne++;
            return true;
   }

   //méthode getNumero fournissant le numéro associé à un nom d’abonné fourni en argument,
    public String getNumero(String nom) {
     for (int i = 0; i < nbr_abonne; i++) {
       if (nom.equals(repertoire[i].getNom())) 
       return repertoire[i].getNumeroTelephone();
    }
    return null; // Abonné non trouvé
   }

    //méthode getNAbonnes qui fournit le nombre d’abonnés figurant dans le répertoire,
    public int getNAbonnes() {
    return nbr_abonne;
   }
   
   //méthode getAbonne fournissant l’abonné dont le rang est fourni en argument,
    public Abonne getAbonne(int rang) {
         if (rang < nbr_abonne) 
		        return repertoire[rang];
		
         return null;
   }

   // méthode getAbonnesTries fournissant un tableau des références des différents abonnés, rangés par ordre alphabétique 
     public Abonne[] getAbonnesTries() {

        Abonne[] sortedAbonnes = new Abonne[nbr_abonne];
        System.arraycopy(repertoire, 0, sortedAbonnes, 0, nbr_abonne);

        for (int i = 0; i<nbr_abonne-1 ; i++)
			for (int j = i+1; j<nbr_abonne ; j++)
				if(sortedAbonnes[i].getNom().compareTo(sortedAbonnes[j].getNom())>0)
				{
					Abonne temp = sortedAbonnes[i];
					sortedAbonnes[i]=sortedAbonnes[j];
					sortedAbonnes[j] = temp;
				}
		return sortedAbonnes;
       
     }
/*.compareTo(): C'est une méthode de la classe String en Java, utilisée pour comparer deux chaînes de caractères lexicographiquement. 
si la chaîne actuelle est "plus grande" que la chaîne passée en argument, elle renvoie un nombre positif ;
 si elles sont égales, elle renvoie 0 ; sinon, elle renvoie un nombre négatif. */   
 


}
