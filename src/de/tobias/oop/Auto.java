package de.tobias.oop;

public class Auto {

    public int geschwindigkeit;
    public String farbe;
    public int anzahlInsassen;
    public int anzahlTueren;
    public String name;

    public void init(int geschwindigkeit, String farbe, int anzahlInsassen) {
        this.geschwindigkeit = geschwindigkeit;
        this.farbe = farbe;
        this.anzahlInsassen = anzahlInsassen;
    }

    public void init() {
        this.geschwindigkeit = 0;
        this.farbe = "weiß";
        this.anzahlInsassen = 0;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void einsteigen(int anzahlInsassen) {
        this.anzahlInsassen += anzahlInsassen;
    }

    public void aussteigen(int anzahlInsassen) {
        this.anzahlInsassen -= anzahlInsassen;
    }

    public void beschleunigen(int umwieviel) {
        this.geschwindigkeit += umwieviel;
    }

    public void bremsen(int umwieviel) {
        this.geschwindigkeit -= umwieviel;
    }

    public void lackieren(String neueFarbe) {
        this.farbe = neueFarbe;
    }

}
