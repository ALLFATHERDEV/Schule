package de.tobias.datenkapselung;

public class AutoKapselung {

    private int geschwindigkeit;
    private String farbe;
    private int anzahlInsassen;
    private int anzahlTueren;
    private String name;

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

    //GETTER
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getAnzahlInsassen() {
        return anzahlInsassen;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public String getName() {
        return name;
    }

    //SETTER
    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnzahlInsassen(int anzahlInsassen) {
        this.anzahlInsassen = anzahlInsassen;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void einsteigen(int anzahlInsassen) {
        this.anzahlInsassen += anzahlInsassen;
    }

    public void aussteigen(int anzahlInsassen) {
        this.anzahlInsassen -= anzahlInsassen;
        if(this.anzahlInsassen < 0)
            this.anzahlInsassen = 0;
    }

    public void beschleunigen(int umwieviel) {
        this.geschwindigkeit += umwieviel;
    }

    public void bremsen(int umwieviel) {
        this.geschwindigkeit -= umwieviel;
        if(this.geschwindigkeit < 0)
            this.geschwindigkeit = 0;
    }

    public void lackieren(String neueFarbe) {
        this.farbe = neueFarbe;
    }

}
