package TP4POO.exercice3;

class Abonne {
    private String nom;
    private String numeroTelephone;

    public Abonne(String nom, String numeroTelephone) {
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String toString(){
	return "[ nom: " +this.getNom() + " numero: "+ this.getNumeroTelephone() + "]";
    }
}
