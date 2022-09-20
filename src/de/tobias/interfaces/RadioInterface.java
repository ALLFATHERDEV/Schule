package de.tobias.interfaces;

public interface RadioInterface {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    int getVolume();

    void setVolume(int vol);

}
