package de.tobias.interfaces;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Uhrenradio implements UhrInterface, RadioInterface{

    private int volume;

    public Uhrenradio(int volume) {
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

    @Override
    public String getTime() {
        return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
    }
}
