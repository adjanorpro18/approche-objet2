package fr.diginamic.formes;

public class Rectangle extends Forme{

    public double longueur;
    public double largeur;

    /**
     * Constructeur de la classe
     * @param longueur
     * @param largeur
     */
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle() {

    }

    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return (longueur + largeur) * 2;
    }
}
