package com.codeclan.amymorrison.shakespeare.instruments;


import java.util.ArrayList;
import java.util.HashMap;

public class Exchange {

    private double till;
    private ArrayList<StockItem> stock;

    public Exchange(){
        this.till = 0;
        stock = new ArrayList<>();
    }

    public void addStock(StockItem stockItem){
        stock.add(stockItem);
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public double getPotentialGrossProfit() {
        double sum = 0.00;
        for (StockItem item : stock) {
            sum += item.calculateMarkup ( );
        }
        return sum;
    }


}
