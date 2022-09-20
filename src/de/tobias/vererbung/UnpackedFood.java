package de.tobias.vererbung;

import java.util.Scanner;

public class UnpackedFood extends Product{

    private int gewicht;
    private double kiloPreis;

    public UnpackedFood(int barcode, String bezeichnung, int gewicht, double kiloPreis) {
        super(barcode, bezeichnung);
        this.gewicht = gewicht;
        this.kiloPreis = kiloPreis;
    }

    @Override
    public void printer() {
        super.printer();
        System.out.printf("Gewicht: %d%n", gewicht);
        System.out.printf("Kilopreis: %g%n", kiloPreis);
    }

    @Override
    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie den Barcode ein:");
        this.barcode = scanner.nextLong();

        System.out.println("Bitte geben sie die Bezeichnung ein:");
        this.bezeichnung = scanner.next();

        System.out.println("Bitte geben sie das Gewicht ein:");
        this.gewicht = scanner.nextInt();

        System.out.println("Bitte geben sie den Kilopreis ein:");
        this.kiloPreis = scanner.nextDouble();

        scanner.close();
    }

    public int getGewicht() {
        return gewicht;
    }

    public double getKiloPreis() {
        return kiloPreis;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void setKiloPreis(double kiloPreis) {
        this.kiloPreis = kiloPreis;
    }
}
