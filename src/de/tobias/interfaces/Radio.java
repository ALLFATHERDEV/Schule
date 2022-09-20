package de.tobias.interfaces;

public class Radio implements RadioInterface{

    private int volume;

    public Radio(int volume) {
        this.volume = volume < MIN_VOLUME || volume > MAX_VOLUME ? 0 : volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int vol) {
        if(vol < MIN_VOLUME || vol > MAX_VOLUME)
            return;
        this.volume = vol;
    }
}
