package fr.diginamic.entities;

public class TheatrePro {
    public String nom;
    public Spectacle spectacle ;


    /**
     * Constructeur de classe
     * @param spectacles
     * @param spectacle
     */
    public TheatrePro(String nom, Spectacle spectacle) {
        this.nom = nom;
        this.spectacle = spectacle;
    }


    /**
     * Getters et Setters des attributs
     * @return
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    /**
     * Methode qui ajoute un spectacle
     * @param spectacle
     */
    public void ajouterSpectacle(Spectacle spectacle){

        if(this.spectacle == null){
            this.spectacle = new Spectacle(spectacle); // on crée un tableau avec le nouveau element ajouté
        }else {
            Spectacle newSpectacle = new Spectacle(this.spectacle);

            //Réaffectation du nouveau tableau
            setSpectacle(newSpectacle);
        }

    }

    /**
     * Methode inscrire au spectacle
     * @param nombreClient
     * @param nom
     */

    public void inscrire(int nombreClient, Spectacle spectacle){

        if(spectacle.nombreInscrits == spectacle.personneMax || spectacle.nom == null){
            System.out.println(" Il y a une erreur ... !");
        }else{
            System.out.println("Le spectacle " + spectacle.nom + " a eu " + nombreClient + " nombre de clients !");
        }

    }

    /**
     * Methode qui retourne la valeur de la recette globale de l'établissement
     * @param spectacle
     * @return
     */

    public double recetteGlobale(){ // A revoir car pas totalement fini

        //La recette de chaque spectacle
        double recette = spectacle.getTarif() * spectacle.getNombreInscrits();

        //La recette globale de l'établissement
        int [] recetteTotale = new int[0];
        int total = 0;
        for(int i = 0; i< recetteTotale.length; i++){
            total += recetteTotale[i];

        }
        return recette;
    }

    /**
     * method equi retourne le nombre total d'inscrits aux divers spectacles
     * @param spectacle
     * @return
     */

    public int getNbTotalClients(Spectacle spectacle){
            spectacle.nombreInscrits = 0;
            for(int i = 0; i < spectacle.nom.length() ; i++){
                spectacle.nombreInscrits += spectacle.nombreInscrits;
                spectacle.nombreInscrits++;
            }
        return spectacle.nombreInscrits;
    }

}
