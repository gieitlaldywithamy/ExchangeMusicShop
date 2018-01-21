package com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes;

import com.codeclan.amymorrison.shakespeare.instruments.stockitems.Instrument;

/**
 * Created by amymorrison on 19/01/2018.
 */

public class Bass extends Instrument {

    private int numberOfStrings;

    public Bass(double buyingPrice, double sellingPrice, boolean used, String description, String material, String colour, String brand) {
        super(buyingPrice, sellingPrice, used, description, material, colour, brand, InstrumentType.STRING, InstrumentName.BASS);
        this.numberOfStrings = 4;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
