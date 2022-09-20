package de.tobias.interfaces;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Uhr implements UhrInterface {


    @Override
    public String getTime() {
        return new SimpleDateFormat("hh:mm").format(Calendar.getInstance().getTime());
    }
}
