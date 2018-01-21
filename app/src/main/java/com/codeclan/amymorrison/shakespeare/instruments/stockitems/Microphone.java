package com.codeclan.amymorrison.shakespeare.instruments.stockitems;

import com.codeclan.amymorrison.shakespeare.instruments.StockItem;


public class Microphone extends StockItem {

    private AccessoryType accessoryType;

    public Microphone(double buyingPrice, double sellingPrice, boolean used, String description) {
        super(buyingPrice, sellingPrice, used, description);
        this.accessoryType = AccessoryType.MICROPHONE;
    }

    public String getAccessoryType() {
        return this.accessoryType.getName();
    }
}
