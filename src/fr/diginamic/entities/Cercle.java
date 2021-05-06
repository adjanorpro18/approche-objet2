package fr.diginamic.entities;

public class Cercle {
    private double rayon;


    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetreCercle(){
        return rayon * 2 * Math.PI;
    }

    public double surfaceCercle(){
        return Math.pow(rayon, 2) * Math.PI;
    }
}
