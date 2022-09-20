package de.tobias.konstruktoren;

import de.tobias.oop.Auto;

public class Artikel {

    public static int anzahlArtikel = 0;

    private long artikelNummer;
    private String artikelBezeichnung;
    private double verkaufsPreis;

    public Artikel(long artikelNummer, String artikelBezeichnung, double verkaufsPreis) {
        this.artikelNummer = artikelNummer;
        this.artikelBezeichnung = artikelBezeichnung;
        this.verkaufsPreis = verkaufsPreis;

        System.out.printf("Der Artikel mit der Artikelnummer %d wurde angelegt%n", artikelNummer);
        anzahlArtikel++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Der Artikel mit der Artikelnummer %d wurde zerstört%n", artikelNummer);
        anzahlArtikel--;
    }

    public void print() {
        System.out.printf("| Artikelnummer: %d | Artikelbezeichnung: %s | Verkaufspreis: %g", artikelNummer, artikelBezeichnung, verkaufsPreis);
    }

    public double getVerkaufsPreis() {
        return verkaufsPreis;
    }

    public long getArtikelNummer() {
        return artikelNummer;
    }

    public String getArtikelBezeichnung() {
        return artikelBezeichnung;
    }

    public void setArtikelBezeichnung(String artikelBezeichnung) {
        this.artikelBezeichnung = artikelBezeichnung;
    }

    public void setArtikelNummer(long artikelNummer) {
        this.artikelNummer = artikelNummer;
    }

    public void setVerkaufsPreis(double verkaufsPreis) {
        if(verkaufsPreis < 0)
            verkaufsPreis = 0;
        this.verkaufsPreis = verkaufsPreis;
    }
}
