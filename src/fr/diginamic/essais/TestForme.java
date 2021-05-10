package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

import java.util.ArrayList;

public class TestForme {
    public static void main(String[] args) {

        ArrayList <Forme> formes = new ArrayList<Forme>();
        formes.add( new Rectangle( 27.5, 12.4));
        formes.add(new Cercle(8.5));
        formes.add(new Carre(12));


        for (Forme forme: formes
             ) {
            System.out.println(forme.calculerPerimetre());
            System.out.println(forme.calculerSurface());

        }
    }
}
