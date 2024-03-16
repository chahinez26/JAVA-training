package TP2POO;
import java.util.Scanner;
public class EXERCICE4 {
   public static void main(String[] args){
   //remplir la mat avec val1 si les indiche de ligne sont paires et sinon avec val2

    int [] [] mat;
    int n, m;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("saisir n :");
    n = sc.nextInt();
    System.out.println("saisir m :");
    m = sc.nextInt();

    mat = new int [n][m];
    int val1 = 0;
    int val2 = 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (i % 2 == 0) { mat[i][j] = val1;} 
            else { mat[i][j] = val2;} 
        }
    }
    //affiche le contenu de la matrice ligne par ligne (chaque ligne sur une une autre)
    
    System.out.println("affichage de la matrice :");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(mat[i][j] + " ");
            //println nous permet de sauter la ligne automatiquement  ln = \n
        }
        System.out.println(); //j'ai un probleme il saute la ligne a chaque element de la mat
    }
    sc.close();
   }
}
