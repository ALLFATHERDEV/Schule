package de.tobias.vererbung;

import java.util.Scanner;

public abstract class Product {

    protected long barcode;
    protected String bezeichnung;

    public Product(int barcode, String bezeichnung) {
        this.barcode = barcode;
        this.bezeichnung = bezeichnung;
    }

    public long getBarcode() {
        return barcode;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void printer() {
        System.out.printf("Barcode: %d%n", barcode);
        System.out.printf("Bezeichnung: %s%n", bezeichnung);
    }

    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie den Barcode ein:");
        this.barcode = scanner.nextLong();

        System.out.println("Bitte geben sie die Bezeichnung ein:");
        this.bezeichnung = scanner.nextLine();
        scanner.close();
    }
}
