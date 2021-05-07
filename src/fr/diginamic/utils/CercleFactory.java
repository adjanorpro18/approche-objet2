package fr.diginamic.utils;

import fr.diginamic.entities.Cercle;

public class CercleFactory {



    public static Cercle fabriquerCercle(double rayon) {
        return new Cercle(rayon);
    }
}
