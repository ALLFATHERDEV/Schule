package de.tobias.konstruktoren;

public class Anwendungsprogramm {

    public static void main(String[] args) throws Throwable {
        Artikel artikel = new Artikel(1234, "Irgend ein Artikel", 100);
        Artikel artikel2 = new Artikel(5678, "Artikel2", 42);

        test1();
        test2();

        System.out.println("Anzahl artikel: " + Artikel.anzahlArtikel);

        artikel.finalize();
        artikel2.finalize();

        System.out.println("Anzahl artikel: " + Artikel.anzahlArtikel);

    }

    public static void test1() throws Throwable{
        Artikel artikel = new Artikel(12, "ArtikelLokal", 13);
        artikel.finalize();
    }

    public static void test2() throws Throwable{
        Artikel artikel = new Artikel(34, "ArtikelLokal2", 55);
        artikel.finalize();
    }

}
