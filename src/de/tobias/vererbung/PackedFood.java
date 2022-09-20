package de.tobias.vererbung;

import java.util.Scanner;

public class PackedFood extends Product{

    private double stueckPreis;

    public PackedFood(int barcode, String bezeichnung, double stueckPreis) {
        super(barcode, bezeichnung);
        this.stueckPreis = stueckPreis;
    }

    @Override
    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie den Barcode ein:");
        this.barcode = scanner.nextLong();

        System.out.println("Bitte geben sie die Bezeichnung ein:");
        this.bezeichnung = scanner.next();

        System.out.println("Bitte geben sie den Stueckpreis ein:");
        this.stueckPreis = scanner.nextDouble();

        scanner.close();
    }

    @Override
    public void printer() {
        super.printer();
        System.out.printf("Stückpreis: %g%n", stueckPreis);
    }

    public double getStueckPreis() {
        return stueckPreis;
    }

    public void setStueckPreis(double stueckPreis) {
        this.stueckPreis = stueckPreis;
    }
}
