package de.tobias.konstruktoren;

public class RGBProgramm {

    public static void main(String[] args) {
        RGB_Color schwarz = new RGB_Color();
        schwarz.print();

        RGB_Color cyan = new RGB_Color();
        cyan.setColor(0, 255, 255);
        cyan.print();
    }

}
