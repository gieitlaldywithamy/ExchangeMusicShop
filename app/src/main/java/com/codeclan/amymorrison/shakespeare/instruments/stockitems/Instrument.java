package com.codeclan.amymorrison.shakespeare.instruments.stockitems;

import com.codeclan.amymorrison.shakespeare.instruments.*;
import com.codeclan.amymorrison.shakespeare.instruments.behaviours.IPlayeable;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.*;


public abstract class Instrument extends StockItem implements IPlayeable {

    private String material;
    private String colour;
    private String brand;
    private InstrumentType type;
    private InstrumentName instrumentName;

    public Instrument(double sellingPrice, double buyingPrice, boolean used, String description, String material, String colour, String brand, InstrumentType type, InstrumentName instrumentName){
        super(sellingPrice, buyingPrice, used, description);
        this.material = material;
        this.colour = colour;
        this.brand = brand;
        this.type = type;
        this.instrumentName = instrumentName;

    }


    public InstrumentName getInstrumentName() {
        return this.instrumentName;
    }

    public String getMaterial(){
        return this.material;
    }

    public String getColour(){
        return this.colour;
    }

    public String getBrand(){
        return this.brand;
    }

    public String play(){
        return this.instrumentName.toString().toLowerCase() + " is playing";
    }



}
