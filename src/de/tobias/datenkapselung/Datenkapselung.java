package de.tobias.datenkapselung;

public class Datenkapselung {

    public static void main(String[] args) {
        //KAPSELUNG
        AutoKapselung autoKapselung = new AutoKapselung();
        autoKapselung.init();

        autoKapselung.beschleunigen(100);
        System.out.println("Geschwindigkeit: " + autoKapselung.getGeschwindigkeit());

        autoKapselung.bremsen(70);
        System.out.println("Geschwindigkeit: " + autoKapselung.getGeschwindigkeit());

        //DATUM
        Datum datum = new Datum();
        Datum datum2 = new Datum();

        datum.init(29, 2, 2016);
        datum.print(); //Dies dürfte das oben genannte Datum ausgeben

        datum.init(29, 2, 2017);
        datum.print(); //Dies dürfte das heutige Datum ausgeben

        datum2.init(15, 7, 2022);
        datum2.print(); //Irgend ein Datum

        //PIGGYBANK
        PiggyBank piggyBank = new PiggyBank();
        piggyBank.init(500);

        piggyBank.add1Cents(50);
        piggyBank.add50Cents(250);
        piggyBank.add1Cents(100);
        piggyBank.add10Cents(100);
        double gesparterBetrag = piggyBank.breakInto();

        System.out.printf("Du hast folgendes gespart: %g%n", gesparterBetrag);


    }

}
