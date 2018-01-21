package com.codeclan.amymorrison.shakespeare.instruments.stockitems;

import com.codeclan.amymorrison.shakespeare.instruments.StockItem;

public class PedalBoard extends StockItem {

    AccessoryType accessoryType;
    public PedalBoard(double buyingPrice, double sellingPrice, boolean used, String description) {
        super(buyingPrice, sellingPrice, used, description);
        this.accessoryType = AccessoryType.PEDALBOARD;
    }

    public AccessoryType getAccessoryType(){
        return this.accessoryType;
    }
}
