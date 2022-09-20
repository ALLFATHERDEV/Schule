package de.tobias.konstruktoren;

public class RGB_Color {

    private int r;
    private int g;
    private int b;

    public RGB_Color() {
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public RGB_Color(int r, int g, int b) {
        this.r = r < 0 || r > 255 ? 0 : r;
        this.g = g < 0 || g > 255 ? 0 : g;
        this.b = b < 0 || b > 255 ? 0 : b;
    }

    public void setColor(int r, int g, int b) {
        this.r = r < 0 || r > 255 ? 0 : r;
        this.g = g < 0 || g > 255 ? 0 : g;
        this.b = b < 0 || b > 255 ? 0 : b;
    }

    public void setB(int b) {
        this.b = b < 0 || b > 255 ? 0 : b;
    }

    public void setG(int g) {
        this.g = g < 0 || g > 255 ? 0 : g;
    }

    public void setR(int r) {
        this.r = r < 0 || r > 255 ? 0 : r;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public int getR() {
        return r;
    }

    public void print() {
        System.out.printf("RGB: (%d,%d,%d) %n", r, g, b);
    }
}
