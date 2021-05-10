package fr.diginamic.salaire;

public abstract class Intervenant {
    public String nom;
    public String prenom;
    public double salaire;
    public String statut;

    /**
     * Constructeur de la classe
     * @param nom
     * @param prenom
     */
    public Intervenant(String nom, String prenom, String statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;
    }

    /**
     * methode abstraite de la classe
     */
    public abstract double getSalaire();


    public abstract String afficherDonnees();


    @Override
    public String toString() {
        return "Intervenant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                ", statut='" + statut + '\'' +
                '}';
    }
}
