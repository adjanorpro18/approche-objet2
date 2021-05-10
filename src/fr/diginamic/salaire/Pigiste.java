package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

    private int nbJourTravaille;
    private  double montantJournalier;


    /**
     * constructzur de la classe
     * @param nbJourTravaille
     * @param montantJournalier
     */
    public Pigiste(String nom, String prenom, String statut, int nbJourTravaille, double montantJournalier) {
        super(nom, prenom, statut);
        this.nbJourTravaille = nbJourTravaille;
        this.montantJournalier = montantJournalier;
    }

    /**
     * Implementation de la methode heritée de la classe Intervenant
     * @return
     */
    @Override
    public double getSalaire() {
        return nbJourTravaille * montantJournalier;
    }

    @Override
    public String afficherDonnees() {


        return nom + " " + prenom + " est " + statut + " et à " + nbJourTravaille*montantJournalier + " comme salaire pour la mission réalisée";
    }
}
