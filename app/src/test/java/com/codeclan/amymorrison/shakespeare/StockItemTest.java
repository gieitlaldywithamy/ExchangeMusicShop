package com.codeclan.amymorrison.shakespeare;

import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Bass;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Guitar;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Viola;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.InstrumentName;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.Microphone;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.PedalBoard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amymorrison on 19/01/2018.
 */

public class StockItemTest {

    Viola viola;
    Bass bass;
    Guitar guitar;
    Microphone microphone;
    PedalBoard pedalBoard;

    @Before
    public void before(){
        viola = new Viola(24.56, 45.60, false, "suitable for orchestra", "wood", "tan", "colman");
        bass = new Bass(48.90, 85.90, true, "donated from afo","wood", "maroon", "gibson");
        guitar = new Guitar(80.50, 78.90, true, "christmas gift","plastic", "silver", "argos", true);
        microphone = new Microphone(12.30, 20.00, false, "perfectly new scayles");
    }

    @Test
    public void instrumentHasName(){
        assertEquals(InstrumentName.VIOLA, viola.getInstrumentName());

    }

    @Test
    public void bassMarkup(){
        assertEquals(37, bass.calculateMarkup(), 0.01);
    }

    @Test
    public void violaMarkupPercentage(){
        assertEquals(76, bass.markupPercentage());
    }

    @Test
    public void canSetDescription(){
        guitar.setDescription("3/4 size");
        assertEquals("3/4 size", guitar.getDescription());
    }
}
