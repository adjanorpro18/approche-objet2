package fr.diginamic.essais;

import fr.diginamic.entities.Spectacle;
import fr.diginamic.entities.TheatrePro;

public class TestTheatrePro {

    public static void main(String[] args) {

        // Creation des différents spectacles

        Spectacle spectacle = new Spectacle("Paris","Cirque", 32.50, 120, 98);
        Spectacle spectacle1 = new Spectacle("Disney","Marionnette", 42.50, 110, 104);
        Spectacle spectacle2 = new Spectacle("London","Danse", 30.00, 250, 190);

        // Création des instances TheatrePro

        TheatrePro theatre = new TheatrePro("theatre", spectacle);
        TheatrePro theatre1 = new TheatrePro("theatre1", spectacle1);
        TheatrePro theatre2 = new TheatrePro("theatre2", spectacle2);

        //Inscription des clients dans différents spectacles

        theatre.inscrire(98, spectacle);
        theatre1.inscrire(104, spectacle1);
        theatre2.inscrire(190, spectacle2);

        //Affichage de la recette globale
        System.out.println("\n ");
        System.out.println("la recette globale du premier spectacle est égale à " + theatre.recetteGlobale());
        System.out.println("la recette globale du premier spectacle est égale à " + theatre1.recetteGlobale());
        System.out.println("la recette globale du premier spectacle est égale à " + theatre2.recetteGlobale());


    }
}

