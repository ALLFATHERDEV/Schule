package de.tobias.vererbung;

public class VererbungProgramm {

    public static void main(String[] args) {
        PackedFood packedFood = new PackedFood(123, "Irgendein Food", 2);
        UnpackedFood unpackedFood = new UnpackedFood(123, "Unpacked Food lol", 2, 3);

        packedFood.printer();
        System.out.println("-------------------------------");
        packedFood.scanner();
        System.out.println("-------------------------------");
        packedFood.printer();
        packedFood.setBezeichnung("Noch eine Änderung");
        packedFood.printer();

        System.out.println("----------------------UNPACKED----------------------");
        unpackedFood.printer();
        System.out.println("-------------------------------");
        unpackedFood.scanner();
        System.out.println("-------------------------------");
        unpackedFood.printer();
        unpackedFood.setBezeichnung("LOL");
        unpackedFood.printer();

    }

}
