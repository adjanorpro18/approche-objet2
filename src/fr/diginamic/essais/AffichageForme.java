package fr.diginamic.essais;

import fr.diginamic.formes.Forme;


public class AffichageForme {


    /**
     * afficher le périmetre ainsi que la surface de la forme concernée
     * @param forme
     */
    public void afficher(Forme forme){

            System.out.println("Le périmètre de ce rectangle est de " + forme.calculerPerimetre());
            System.out.println("La surface de ce rectangle est de " + forme.calculerSurface());

    }
}
