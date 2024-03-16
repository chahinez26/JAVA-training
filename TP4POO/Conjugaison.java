/*Ecrire un programme qui lit au clavier un verbe du premier groupe ( il s’assurera qu’il est bien terminé
par er) et qui affiche la conjugaison au présent de l’indicatif. On supposera qu’il s’agit d’un verbe
régulier.
*/

package TP4POO;
import java.util.Scanner;

public class Conjugaison {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String verbe = "";
    boolean condition ;

   /* 
    while (!verbe.endsWith("er")) 
    {
        System.out.print("Veuillez saisir un verbe du premier groupe :  ");
        verbe = sc.next();
    }
    */
    
    System.out.print("Veuillez saisir un verbe se terminant par 'er':  ");
    do {
        verbe = sc.next();
        condition = !verbe.endsWith("er");
        if (condition) {
            System.out.print("Le verbe ne se termine pas par 'er'. Donnez un autre verbe :  ");
        }
    } while (condition);

    /* la méthode substring() est utilisée pour extraire une sous-chaîne de la chaîne de caractères verbe commençant à 
    l'index 0 et se terminant à l'index verbe.length() - 2,ce qui enlève les deux derniers caractères ("er"). */ 
    String radicale = verbe.substring(0, verbe.length() - 2);

    String c1 = "e";
    String c2 = "es";
    String c3 = "ons";
    String c4 = "ez";
    String c5 = "ent";
    System.out.println("La conjugaison du verbe "+verbe+" est :  \n");
    System.out.println ( "Je " + radicale + c1 +"\n" +
                         "Tu " + radicale + c2 + "\n" +
                         "Il / Elle  " + radicale + c1 + "\n" +
                         "Nous " +radicale + c3 + "\n" +
                         "Vous " +radicale + c4 + "\n" +
                         "Ils / Elles  " + radicale + c5 + "\n"  );
    sc.close();
      }

}    
    
/*
chaine += " World";
ou
builder.append("Hello");
builder.append(" ");
builder.append("World");
String resultat = builder.toString();
ou

 */
