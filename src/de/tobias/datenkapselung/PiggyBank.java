package de.tobias.datenkapselung;

public class PiggyBank {

    private int zaehler1Cent;
    private int zaehler10Cent;
    private int zaehler50Cent;
    private int zaehler1Euro;

    private int maximaleAnzahl;
    private boolean aufgebrochen;

    public void init(int maximaleAnzahl) {
        if(maximaleAnzahl < 0) {
            System.out.println("Die maximale Anzahl muss größer als 0 sein");
            return;
        }
        this.maximaleAnzahl = maximaleAnzahl;
        this.zaehler1Cent = 0;
        this.zaehler10Cent = 0;
        this.zaehler50Cent = 0;
        this.zaehler1Euro = 0;
        this.aufgebrochen = false;
    }

    public int add1Cents(int anzahl) {
        this.zaehler1Cent += anzahl;
        if(this.getAktuelleAnzahl() > maximaleAnzahl) {
            return maximaleAnzahl - this.getAktuelleAnzahl();
        }
        return 0;
    }

    public int add10Cents(int anzahl) {
        this.zaehler10Cent += anzahl;
        if(this.getAktuelleAnzahl() > maximaleAnzahl) {
            return maximaleAnzahl - this.getAktuelleAnzahl();
        }
        return 0;
    }

    public int add50Cents(int anzahl) {
        this.zaehler50Cent += anzahl;
        if(this.getAktuelleAnzahl() > maximaleAnzahl) {
            return maximaleAnzahl - this.getAktuelleAnzahl();
        }
        return 0;
    }

    public int add1Euro(int anzahl) {
        this.zaehler1Euro += anzahl;
        if(this.getAktuelleAnzahl() > maximaleAnzahl) {
            return maximaleAnzahl - this.getAktuelleAnzahl();
        }
        return 0;
    }

    public boolean isEmpty() {
        return this.getAktuelleAnzahl() == 0;
    }

    public boolean isFull() {
        return this.getAktuelleAnzahl() == maximaleAnzahl;
    }

    public boolean isBroken() {
        return this.aufgebrochen;
    }

    public double breakInto() {
        this.aufgebrochen = true;

        double betrag = 0;
        for(int i = 0; i < zaehler1Cent; i++) {
            betrag += 0.01;
        }
        for(int i = 0; i < zaehler10Cent; i++) {
            betrag += 0.1;
        }
        for(int i = 0; i < zaehler50Cent; i++) {
            betrag += 0.5;
        }
        for(int i = 0; i < zaehler1Euro; i++) {
            betrag += 1;
        }

        this.zaehler1Cent = 0;
        this.zaehler10Cent = 0;
        this.zaehler50Cent = 0;
        this.zaehler1Euro = 0;
        return betrag;
    }

    private int getAktuelleAnzahl() {
        return this.zaehler1Cent + this.zaehler10Cent + this.zaehler50Cent + this.zaehler1Euro;
    }

}
