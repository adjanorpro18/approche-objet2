package fr.diginamic.entities;

public class Spectacle {
    public  String nom;
    public String type;
    public double tarif;
    public int personneMax;
    public int nombreInscrits;


    public Spectacle(String nom, String type, double tarif, int personneMax, int nombreInscrits) {
        this.nom = nom;
        this.type = type;
        this.tarif = tarif;
        this.personneMax = personneMax;
        this.nombreInscrits = nombreInscrits;
    }

    public Spectacle(Spectacle spectacle) {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public int getPersonneMax() {
        return personneMax;
    }

    public void setPersonneMax(int personneMax) {
        this.personneMax = personneMax;
    }

    public int getNombreInscrits() {
        return nombreInscrits;
    }

    public void setNombreInscrits(int nombreInscrits) {
        this.nombreInscrits = nombreInscrits;
    }
}
