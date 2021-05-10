package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {

    /**
     * Attributs de la classe moyenne
     */
    private double [] monTab;

    /**
     * Constructeur sans parametre
     */
    public CalculMoyenne() {

    }

    public double[] getMonTab() {
        return monTab;
    }

    public void setMonTab(double[] monTab) {
        this.monTab = monTab;
    }

    /**
     * Methode qui ajoute un double ua tableau des moyennes
     * @return
     */
    public void ajout(double d){

        if(this.monTab == null){ // Si le tableau est vide , on stocke le premier élement
            this.monTab = new double[] {d};
        }else{ //on crée une nouveau tableau puis on ajoute l'element
            double [] newTab = new double[this.monTab.length + 1];

            //remplir le tableau avec les elements
            for(int i = 0; i<this.monTab.length; i++){
                newTab[i] = this.monTab[i];
            }
            //Ajouter la nouvelle valeur
            newTab[this.monTab.length] = d;

            //Reaffectation du nouveau tableau
            setMonTab(newTab);
        }
    }
    /**
     * Methode qui retourne la moyenne des elements du tableau
     * @param
     */

    public double calcul()
    {

        double total = 0;
        double [] monTab = new double[0];
        for(int i = 0; i < this.monTab.length; i++){

            total += this.monTab[i];
        }
        return  total / this.monTab.length;
    }

}
