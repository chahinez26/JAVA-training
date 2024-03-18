package TP5POO.exercice02;
import java.util.Date;

public class Vendeur extends EmployeComercial{

    public Vendeur(String nom, String prenom, int age, Date dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return chiffreAffaire * 0.20 + 10000; // 20 % du chiffre d'affaire + 10000 DA de bonus
    }

}
