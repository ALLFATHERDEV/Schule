package de.tobias.oop;

import java.time.LocalDateTime;

public class AutoVerbessert {

    private int geschwindigkeit;
    private int anzahlInassen;
    private String farbe;
    private boolean hatTuev;
    private LocalDateTime datumTuev;
    private boolean hatAnhengerKupplung;

    public AutoVerbessert() {
        this(0, 0, "weiß", true, LocalDateTime.now(), false);
    }

    public AutoVerbessert(int geschwindigkeit, int anzahlInassen, String farbe, boolean hatTuev, LocalDateTime datumTuev, boolean hatAnhengerKupplung) {
        this.geschwindigkeit = geschwindigkeit;
        this.anzahlInassen = anzahlInassen;
        this.farbe = farbe;
        this.hatTuev = hatTuev;
        this.datumTuev = datumTuev;
        this.hatAnhengerKupplung = hatAnhengerKupplung;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void beschleunigen(int umwieviel) {
        if (umwieviel < 0) {
            throw new IllegalArgumentException("Die Geschwindigkeit kann nicht um ein negatives erhöt werden");
        }
        this.geschwindigkeit += umwieviel;
    }

    public void bremsen(int umwieviel) {
        if(this.geschwindigkeit - umwieviel < 0) {
            throw new IllegalArgumentException("Geschwindigkeit < 0 ");
        }
        this.geschwindigkeit -= umwieviel;
    }

    public int getAnzahlInassen() {
        return anzahlInassen;
    }

    public void setAnzahlInassen(int anzahlInassen) {
        this.anzahlInassen = anzahlInassen;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public boolean isHatTuev() {
        return hatTuev;
    }

    public void setHatTuev(boolean hatTuev) {
        this.hatTuev = hatTuev;
    }

    public LocalDateTime getDatumTuev() {
        return datumTuev;
    }

    public void setDatumTuev(LocalDateTime datumTuev) {
        this.datumTuev = datumTuev;
    }

    public boolean isHatAnhengerKupplung() {
        return hatAnhengerKupplung;
    }

    public void setHatAnhengerKupplung(boolean hatAnhengerKupplung) {
        this.hatAnhengerKupplung = hatAnhengerKupplung;
    }

    @Override
    public String toString() {
        return "AutoVerbessert{" +
                "geschwindigkeit=" + geschwindigkeit +
                ", anzahlInassen=" + anzahlInassen +
                ", farbe='" + farbe + '\'' +
                ", hatTuev=" + hatTuev +
                ", datumTuev=" + datumTuev +
                ", hatAnhengerKupplung=" + hatAnhengerKupplung +
                '}';
    }
}
