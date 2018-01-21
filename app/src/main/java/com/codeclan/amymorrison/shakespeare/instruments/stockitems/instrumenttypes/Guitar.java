package com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes;

import com.codeclan.amymorrison.shakespeare.instruments.stockitems.Instrument;

/**
 * Created by amymorrison on 19/01/2018.
 */

public class Guitar extends Instrument {

    private boolean acoustic;
    public Guitar(double buyingPrice, double sellingPrice, boolean used, String description, String material, String colour, String brand, boolean acoustic) {
        super(buyingPrice, sellingPrice, used, description, material, colour, brand, InstrumentType.STRING, InstrumentName.GUITAR);
        this.acoustic = acoustic;
    }

    public String play() {
        return "plays opening chords to smells like teen spirit";
    }


    public boolean isAcoustic(){
        return this.acoustic;
    }
}
