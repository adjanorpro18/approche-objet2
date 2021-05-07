package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne calculMoyenne = new CalculMoyenne();
        CalculMoyenne calculMoyenne1 = new CalculMoyenne();
        calculMoyenne.ajout(18.5);
        calculMoyenne.ajout(11.0);
        calculMoyenne.ajout(12.5);

        calculMoyenne1.ajout(13.5);
        calculMoyenne1.ajout(25);
        calculMoyenne1.ajout(15.5);



        System.out.println( " la moyenne : " + calculMoyenne.calcul());
        System.out.println( " la moyenne1 : " + calculMoyenne1.calcul());







    }
}
