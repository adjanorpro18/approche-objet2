package fr.diginamic.salaire;

public class Salarie extends Intervenant{

    private double montantSalaire;

    /**
     * Constructeur de la classe
     * @param montantSalaire
     */
    public Salarie(String nom, String prenom, String statut, double montantSalaire) {
        super(nom, prenom, statut);
        this.montantSalaire = montantSalaire;
    }

    /**
     * Implementation de la methode heritée de la classe mere intervenant
     * @return
     */
    @Override
    public double getSalaire() {
        return montantSalaire;
    }

    @Override
    public String afficherDonnees() {

        return nom + " " + prenom + " est " + statut + " et à " + montantSalaire + " comme salaire mensuel";
    }


}
