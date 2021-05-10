package fr.diginamic.essais;

import fr.diginamic.entities.Salaire;
import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

import java.util.ArrayList;

public class TestIntervenant {
    public static void main(String[] args) {

        ArrayList<Intervenant> intervenants = new ArrayList<Intervenant>();

        intervenants.add(new Salarie("Lages", "Aimée", "Cadre", 3212.90));
        intervenants.add(new Pigiste("Dupont", "Marcel", "Interimaire", 7, 80.25 ));
        intervenants.add(new Salarie("Lassey", "Hervé", "Employé", 1672.22));
        intervenants.add(new Pigiste("Lecinq", "Cedric", "Cadre", 15, 170.85 ));



        //Afficher le résultat retournée par la methode getSalaire

        for (Intervenant inter: intervenants
             ) {
            //System.out.println(inter.getSalaire());
            System.out.println(inter.afficherDonnees());

        }

    }

}
