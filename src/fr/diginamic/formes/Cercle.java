package fr.diginamic.formes;

public class Cercle extends Forme{

    private double rayon;

    /**
     * le constructeur de la classe
     * @param rayon
     */
    public Cercle(double rayon) {
        this.rayon = rayon;
    }


    @Override
    public double calculerSurface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double calculerPerimetre() {
        return Math.PI * rayon * 2;
    }
}
