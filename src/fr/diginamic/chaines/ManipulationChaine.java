package fr.diginamic.chaines;

import fr.diginamic.entities.Salaire;

public class ManipulationChaine {
    public static void main(String[] args) {

        //Déclaration d'une chaine de caractère

        String chaine = "Durant;Marcel;2 523.5";

        // 1-  La methode chartAt(int index) pour afficher le premier carcatère de la chaine
        System.out.println("\n " );
        System.out.println("Le premier caractère de cette chaine est: " + chaine.charAt(0));


        //2- La methode length() pour afficher la longueur du chaine de caractère

        System.out.println("La longueur de cette chaine de caractère est: " + chaine.length());



        //3- La methode indexOf(char c) pour afficher l'index d'un caractère contenu dans la chaine

        System.out.println("L'index du premier caractère ';' est: " + chaine.indexOf(";"));


        //4- La methode substring(int start , int end ) pour extraire une portion de caractères compris entre
        // un index de début (inclus) et un index de fin(exclu) dans la chaine

        System.out.println("La portion de caractère compris entre l'index 8 et l'index 12 est: " + chaine.substring(7, 11));

        System.out.println("Le nom de la famille de la personne est: " + chaine.substring(0, chaine.indexOf(';')));


        //5- La methode toUpperCase() pour afficher le nom de famille en majuscules

        System.out.println("Le nom de famille en majuscule de la cette chaine est : " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());


        //6- La methode toLowerCase() pour afficher le nom de famille en majuscules

        System.out.println("Le nom de famille en majuscule de la cette chaine est : " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());

        //7- La methode split() pour découper la chiane de caractère en morceau

        String [] mots  = chaine.split(";", 3);
        for (String mot:mots
             ) {
            System.out.println("La décomposition de cette chaine de caractère en mots donne : " + mot);
        }

        // Supprimer les espace vide dans la cahien de caractère

        System.out.println("La chaine de caractère sans espace vide est : " + chaine.replaceAll("()+ ","" ));


        Salaire salaire = new Salaire("Durant", "Marcel", 2535.5);

        System.out.println(salaire.toString());


    }

}
