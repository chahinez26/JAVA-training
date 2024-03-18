package TP5POO.exercice02;

public interface EmployeARisque {
    double PRIME_RISQUE = 20000; // Prime mensuelle fixe pour les employés à risque

    default double calculerPrimeRisque() {
        return PRIME_RISQUE;
    }
}