package de.tobias.datenkapselung;

import java.time.LocalDate;

public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public void init(int tag, int monat, int jahr) {
        boolean februar = monat == 2;
        boolean schaltjahr = jahr % 4 == 0 || (jahr % 100 == 0 && jahr % 400 == 0);

        if(februar) {
            if(schaltjahr) {
                if(tag > 29) {
                    this.init();
                    return;
                }
            } else {
                if(tag > 28) {
                    this.init();
                    return;
                }
            }
        }

        switch (monat) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (tag <= 0 || tag > 31) {
                    this.init();
                    return;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (tag <= 0 || tag > 30) {
                    this.init();
                    return;
                }

        }


        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public void init() {
        LocalDate heute = LocalDate.now();
        this.jahr = heute.getYear();
        this.monat = heute.getMonthValue();
        this.tag = heute.getDayOfMonth();
    }

    public void print() {
        System.out.printf("Datum: %d.%d.%d%n", tag, monat, jahr);
    }

}
