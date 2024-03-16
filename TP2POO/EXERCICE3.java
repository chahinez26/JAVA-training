package TP2POO;
import java.util.Scanner;
import java.util.Random;

public class EXERCICE3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  

     System.out.println("----------------QUESTION 1----------------");
     //1--remplir un vecteur avec les n premiere valeurs > 0 multiple de 5 et calculer leur somme
     
     System.out.println("saisissez n :");
     int n = sc.nextInt();

    int [] tab = new int[n] ;
      
    tab[0]=5;
    int S = 5;
    for (int i = 1; i < n; i++) {
        tab[i] = tab[i-1]*5 ;
        S = S + tab[i];
    }
    
    System.out.println("le taleau rempli avec les  "+n+"  premiéres valeurs > 0 miltiples de 5 : ");
    for (int i = 0; i < n; i++) {
        System.out.println(tab[i]);
    }
    System.out.println("\n la somme des elements du tableau est :"+S);
    
    System.out.println("\n----------------QUESTION 2----------------");
    //2--remplir un tableau de n valeurs entiere quelquonque entrées au clavier et calculer leur somme
    System.out.println("\n saisissez n1 :");
    int n1 = sc.nextInt();

    int [] tab2 = new int[n1] ;
    int S2 = 0;
    for (int i = 0; i < n1; i++) {
        System.out.println("saisissez la "+(i+1)+"éme valeur :");
        tab2[i] = sc.nextInt();
        S2 = S2 + tab2[i];
    }
    
    System.out.println("les valeurs du tableau est: ");
    for (int i = 0; i < n; i++) {
        System.out.println(tab2[i]);
    }
    System.out.println("\n la somme des elements du tableau est :"+S2);

    System.out.println("\n----------------QUESTION 3----------------");
    //3--remplir un tableau de n valeurs aléatoires inf a 100 et calculer leur somme avec random
    Random random = new Random();
    System.out.println("\n saisissez n3 :");
    int n3 = sc.nextInt();
    int [] tab3 = new int[n3] ;
    int S3 = 0;
    for (int i = 0; i < n3; i++) {
        tab3[i] = random.nextInt(100);;
        S3 = S3 + tab3[i];
    }
    
    System.out.println("le taleau rempli avec les "+n3+"   valeurs aléatoire est : ");
    for (int i = 0; i < n3; i++) {
        System.out.println(tab3[i]);
    }
    System.out.println("\n la somme des elements du tableau est :"+S3);

    System.out.println("\n----------------QUESTION 4----------------");
    //4--remplir un tableau de n valeurs aléatoires inf a 100 et calculer la somme  avec math.abs
    System.out.println("\n saisissez n4 :");
    int n4 = sc.nextInt();
    int [] tab4 = new int[n4] ;
    int S4 = 0;
    for (int i = 0; i < n4; i++) {
        tab4[i] = Math.abs(random.nextInt(100));;
        S4 = S4 + tab4[i];
    }
    
    System.out.println("le taleau rempli avec les "+n4+"   valeurs aléatoire est : ");
    for (int i = 0; i < n4; i++) {
        System.out.println(tab4[i]);
    }
    System.out.println("\n la somme des elements du tableau est :"+S4);
sc.close();  
}
}
