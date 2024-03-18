package TP5POO.exercice02;


public class Representant extends EmployeComercial{

    public Representant (String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return chiffreAffaire * 0.20 + 20000; // 20 % du chiffre d'affaire + 20000 DA de bonus
    }

    
}
