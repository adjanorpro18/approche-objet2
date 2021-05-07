package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        Operations addition = new Operations();
        Operations soustraction = new Operations();
        Operations multiplication = new Operations();
        Operations division = new Operations();


        System.out.println(addition.calcul(10.5, 4.5, '+'));
        System.out.println(soustraction.calcul(6.5, 2.5, '-'));
        System.out.println(multiplication.calcul(8.5, 4, '*'));
        System.out.println(addition.calcul(7.5, 2.5, '/'));
        
    }
}
