package fr.diginamic.formes;

public class Carre extends Rectangle{
    public double longueur;

    /**
     * Constructeur de la classe
     * @param longueur
     */
    public Carre(double longueur) {
        super();
        this.longueur = longueur;
    }

    @Override
    public double calculerSurface() {
        return longueur * longueur;
    }

    @Override
    public double calculerPerimetre() {
        return longueur * 4;
    }
}
