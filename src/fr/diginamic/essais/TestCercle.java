package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {

    public static void main(String[] args) {

        Cercle cercle = new Cercle(4.2);
        Cercle cercle1 = new Cercle(3.7);

        System.out.println("Le perimètre du premier cercle est : " + cercle.perimetreCercle());
        System.out.println("La surface du premier cercle est : " + cercle.surfaceCercle());
        System.out.println("***************************");
        System.out.println("Le perimètre du second cercle est : " + cercle1.perimetreCercle());
        System.out.println("La surface du second cercle est : " + cercle1.surfaceCercle());
    }
}
