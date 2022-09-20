package de.tobias.oop;

public class Lektion03 {

    public static void main(String[] args) {
        Auto meinAuto = new Auto();
        Auto deinAuto = new Auto();

        meinAuto.init(20, "rot", 2);
        deinAuto.init();

        System.out.println(meinAuto.farbe);
        meinAuto.lackieren("gelb");

        System.out.println(deinAuto.farbe);

        //Aufgabe 1
        meinAuto.geschwindigkeit = 20;

        //Aufgabe 2
        meinAuto.beschleunigen(100);

        //Aufgabe 3
        meinAuto.geschwindigkeit -= 30;

        //Aufgabe 4
        //Problem: Das Auto kann eine Geschwindigkeit < 0 erreichen
        meinAuto.bremsen(40);

        //Aufgabe 5
        meinAuto.setName("Irgend ein Name");
        meinAuto.setAnzahlTueren(5);

    }

}
