package com.codeclan.amymorrison.shakespeare;

import com.codeclan.amymorrison.shakespeare.instruments.Exchange;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    Exchange musicExchange;
    Viola viola;
    Bass bass;
    Guitar guitar;

    @Before
    public void before(){
        musicExchange = new Exchange();
        viola = new Viola(24.56, 45.60, false, "bought from child","wood", "tan", "colman");
        bass = new Bass(48.90, 85.90, true, "probably stolen","wood", "maroon", "gibson");
        guitar = new Guitar(80.50, 78.90, true, "crap quality","plastic", "silver", "argos", false);

    }

    @Test
    public void storeStartsWithNoStock(){
        assertEquals(0, musicExchange.getStockCount());
    }

    @Test
    public void canAddStock(){
        musicExchange.addStock(viola);
        musicExchange.addStock(guitar);
        assertEquals(2, musicExchange.getStockCount());
    }

    @Test
    public void canGetPotentialGrossProfit(){
        musicExchange.addStock(viola);
        musicExchange.addStock(guitar);
        assertEquals(19.44, musicExchange.getPotentialGrossProfit(), 0.01);
    }
}
