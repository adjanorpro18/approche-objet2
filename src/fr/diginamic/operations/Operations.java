package fr.diginamic.operations;

public class Operations {

    private double a;
    private double b;
    private char operateur;


    public double calcul(double a, double b, char operateur)
    {

        if(operateur == '+') {
            return a + b ;
        }
        if(operateur == '-') {
            return a - b ;
        }

        if(operateur == '*') {
            return a * b ;
        }

        if(operateur == '/') {
            return a / b ;
        }
        return 0;
    }
}
