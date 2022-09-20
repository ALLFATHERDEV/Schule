package de.tobias.interfaces;

public class InterfacesProgramm {

    public static void main(String[] args) {
        Uhrenradio uhrenradio = new Uhrenradio(3);
        System.out.println(uhrenradio.getTime());
        System.out.println(uhrenradio.getVolume());
        uhrenradio.setVolume(7);
        System.out.println(uhrenradio.getVolume());
    }

}
