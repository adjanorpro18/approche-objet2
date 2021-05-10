package fr.diginamic.entities;

public class Theatre {

    /**
     * Attributs d'instance de la classe
     */
    private String nom;
    private int capacitePersonneMax;
    private int totalInscrit;
    private double recetteTotale;

    /**
     * Constructeur de la classe avec les attributs d'instance
     * @param nom
     * @param capacitePersonneMax
     * @param totalInscrit
     * @param recetteTotale
     */

    public Theatre(String nom, int capacitePersonneMax, int totalInscrit, double recetteTotale) {
        this.nom = nom;
        this.capacitePersonneMax = capacitePersonneMax;
        this.totalInscrit = totalInscrit;
        this.recetteTotale = recetteTotale;
    }

    public void inscrire( int nombreClients, double prixPlace)
    {
        if(nombreClients < capacitePersonneMax){
           totalInscrit = nombreClients; // Mise à jour du nombre yotal des clients inscrits
            recetteTotale = nombreClients * prixPlace; // La recette totale de l'tablissement
            System.out.println("Il y a " + nombreClients + " personnes inscrites pour une recette totale de  " + recetteTotale + "euros");


        }else{

            System.out.println(" Il y a une erreur de programme ");
        }

    }

    /**
     * Les getteurs et Setteurs des attributs d'instance
     * @return
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitePersonneMax() {
        return capacitePersonneMax;
    }

    public void setCapacitePersonneMax(int capacitePersonneMax) {
        this.capacitePersonneMax = capacitePersonneMax;
    }

    public int getTotalInscrit() {
        return totalInscrit;
    }

    public void setTotalInscrit(int totalInscrit) {
        this.totalInscrit = totalInscrit;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public void setRecetteTotale(double recetteTotale) {
        this.recetteTotale = recetteTotale;
    }
}
