package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Oscar", 120, 120, 1200.00);
        Theatre theatre1 = new Theatre("Disney", 120, 70, 1050.00);
        Theatre theatre2 = new Theatre("New York", 120, 90, 900.00);

        theatre1.inscrire(70, 15.00);
        theatre2.inscrire(90, 25.0);
        theatre.inscrire(120, 10.00);



    }
}
