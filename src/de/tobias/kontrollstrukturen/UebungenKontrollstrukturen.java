package de.tobias.kontrollstrukturen;

import java.util.Map;
import java.util.Scanner;

public class UebungenKontrollstrukturen {

    public static void main(String[] args) {
        //aufgabe1();
        //aufgabe2();
        //aufgabe3();
        aufgabe4();
    }

    public static void aufgabe1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getrunkene Flüssigkeit in Liter: ");
        int getrunkeneFluessigkeit = scanner.nextInt();

        System.out.println("Körpermasse in kg: ");
        int koerpermasse = scanner.nextInt();

        System.out.println("Geschlechte (1 = weiblich, 2 = männlich)");
        int geschlecht = scanner.nextInt();

        System.out.println("Getränk auswählen: ");
        System.out.println("1 = Bier");
        System.out.println("2 = Starkbier");
        System.out.println("3 = Biermix");
        System.out.println("4 = Cognac");
        System.out.println("5 = Wodka");
        int getraenk = scanner.nextInt();

        double alkoholVolumenAnteil = switch (getraenk) {
            case 1 -> 0.05;
            case 2 -> 0.08;
            case 3 -> 0.025;
            case 4 -> 0.38;
            case 5 -> 0.42;
            default -> 1;
        };

        double masse = 10 * getrunkeneFluessigkeit * alkoholVolumenAnteil * 0.8;

        double promille = masse / (koerpermasse * (geschlecht == 1 ? 0.6 : 0.7));
        promille = promille * 100;
        promille = Math.round(promille * 100.0) / 100.0;
        System.out.printf("Ihr Promillewert beträgt: %f", promille);
        scanner.close();
    }

    public static void aufgabe2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geschlechte (1 = weiblich, 2 = männlich)");
        int geschlecht = scanner.nextInt();

        System.out.println("Alter:");
        int alter = scanner.nextInt();

        System.out.println("Gewicht in kg:");
        int gewicht = scanner.nextInt();

        System.out.println("Körpergrö0e in cm:");
        int size = scanner.nextInt();

        if(alter <= 17 && size > 120) {
            System.out.println("Es können keine Angaben gemacht werden :(");
            System.exit(0);
        }

        double toleranzgrenzePlus = geschlecht == 1 ? 0.04 : 0.05;
        double toleranzgrenzeMinus = geschlecht == 1 ? -0.07 : -0.05;
        size += 100;

        double toleranzMax = gewicht * toleranzgrenzePlus;
        double toleranzMinus = gewicht * toleranzgrenzeMinus;

        double gewichtMin = gewicht - Math.abs(toleranzMinus);
        double gewichtMax = gewicht + toleranzMax;

        if(gewicht > gewichtMax) {
            System.out.println("Sie haben übergewicht");
        } else if(gewicht < gewichtMin) {
            System.out.println("Sie sind untergewichtig");
        } else {
            System.out.println("Sie haben normal gewicht");
        }
        scanner.close();
    }

    public static void aufgabe3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte nur positive Zahlen eingeben, bei einer Zahl <= 0 wird das Einelsen abgebrochen.");

        int addierteZahl = 0;
        int anzahl = 0;

        while(scanner.hasNextInt()) {
            int eingegebenZahl = scanner.nextInt();
            if(eingegebenZahl == 0)
                break;
            addierteZahl += eingegebenZahl;
            anzahl++;
        }

        double mittelwert = (double) addierteZahl / (double) anzahl;
        System.out.printf("Der Mittelwert beträgt: %g%n", mittelwert);
        scanner.close();
    }

    public static void aufgabe4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getränkeautomat");
        System.out.println("Bitte wählen Sie ihr Getränk aus:");
        System.out.println("1 = Wasser (0,50€)");
        System.out.println("2 = Limonade (1,00€)");
        System.out.println("3 = Bier (1,00€)");
        System.out.println("Bitte geben Sie 1, 2 oder 3 ein: ");
        int getraenk = scanner.nextInt();

        System.out.println("Bitte geben Sie die gewünschte Menge ein: ");
        int menge = scanner.nextInt();

        double getraenkPreis = switch (getraenk) {
            case 1 -> 0.5;
            case 2, 3 -> 1.0;
            default -> -1;
        } * menge;

        System.out.println("------------------Bezahlvorgang------------------");
        System.out.printf("Es fehlen noch: %g €%n", getraenkPreis);
        System.out.println("Bitte geben Sie ein Geldstück ein: ");



        while(getraenkPreis > 0) {
            int geldstueck = scanner.nextInt();
            switch (geldstueck) {
                case 1 -> getraenkPreis -= 1;
                case 2 -> getraenkPreis -= 2;
                case 50 -> getraenkPreis -= 0.5;
                case 20 -> getraenkPreis -= 0.2;
                case 10 -> getraenkPreis -= 0.1;
                case 5 -> getraenkPreis -= 0.05;
            }
            if(getraenkPreis > 0) {
                System.out.printf("Es fehlen noch %g €%n", getraenkPreis);
            }
        }

        double wechselGeld = 0;
        if(getraenkPreis < 0) {
            wechselGeld = Math.abs(getraenkPreis);
        }
        System.out.printf("Bitte entnehmen Sie ihr Wechhselgeld in Höhe von %g €%n", wechselGeld);
        System.out.println("Bitte entnehmen Sie Ihre Getränke");

    }

}
