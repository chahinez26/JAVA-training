package TP2POO;
import java.util.Scanner;

public class EXERCICE1 {
    public static void main(String[] args) {
        //saisir et afficher les donnees
    	
        Scanner sc = new Scanner(System.in);
        //int
        System.out.println("saisir un int :"); int i = sc.nextInt();
        System.out.println("la donnee int est :"+i);
        //float
        System.out.println("saisir un float :"); float f = sc.nextFloat();
        System.out.println("la donnee float est :"+f);
        //double
        System.out.println("saisir un double :"); double d = sc.nextDouble();
        System.out.println("la donnee double est :"+d);
        //char
        System.out.println("saisir un char :"); char c = sc.next().charAt(0);
        System.out.println("la donnee char est :"+c);
        //string
        System.out.println("saisir un string :"); String s = sc.next();
        System.out.println("la donnee string est :"+s);
       //boolean
        System.out.println("saisir un boolean :"); boolean b = sc.nextBoolean();
        System.out.println("la donnee boolean est :"+b);

        //affecter les expressions 
        System.out.println("\n----------------'");

/* 
       boolean b1 = (2 >= 4) || (0 < 6);
        System.out.println("la valeur obtenue est :"+b1);
 
        boolean b2 = (2 >= 4) && (0 <= 6);
        System.out.println("The obtained value is: " + b2);


*/
sc.close();
}
}