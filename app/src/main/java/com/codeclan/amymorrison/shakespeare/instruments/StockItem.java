package com.codeclan.amymorrison.shakespeare.instruments;

import com.codeclan.amymorrison.shakespeare.instruments.behaviours.iSaleable;

import static java.lang.Math.abs;


public abstract class StockItem implements iSaleable {

    private double buyingPrice;
    private double sellingPrice;
    private boolean used;
    private String description;

    public StockItem(double buyingPrice, double sellingPrice, boolean used, String description) {
        this.buyingPrice = abs(buyingPrice);
        this.sellingPrice = abs(sellingPrice);
        this.used = used;
        this.description = description;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public boolean isUsed() {
        return this.used;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }

    public int markupPercentage(){
        return (int) Math.round((calculateMarkup()/this.buyingPrice)*100);
    }


    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }


}
