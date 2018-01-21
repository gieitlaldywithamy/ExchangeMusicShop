package com.codeclan.amymorrison.shakespeare.instrumentstest;

import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Bass;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Guitar;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.InstrumentName;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Viola;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InstrumentTest {

    Viola viola;
    Bass bass;
    Guitar guitar;

    @Before
    public void before(){
        viola = new Viola(24.56, 45.60, false, "bought from child","wood", "tan", "colman");
        bass = new Bass(48.90, 85.90, true, "probably stolen","wood", "maroon", "gibson");
        guitar = new Guitar(80.50, 78.90, true, "crap quality","plastic", "silver", "argos", false);
    }

    @Test
    public void instrumentHasName(){
        assertEquals(InstrumentName.VIOLA, viola.getInstrumentName());

    }

    @Test
    public void bassHasNumberOfStrings(){
        assertEquals(4, bass.getNumberOfStrings());
    }

    @Test
    public void guitarIsAcoustic(){
        assertEquals(false, guitar.isAcoustic());
    }

    @Test
    public void guitarHasBrand(){
        assertEquals("argos", guitar.getBrand());
    }

    @Test
    public void violaHasColour(){
        assertEquals("tan", viola.getColour());
    }

    @Test
    public void violaHasMaterial(){
        assertEquals("wood", viola.getMaterial());
    }

    @Test
    public void bassIsUsed(){
        assertEquals(true, bass.isUsed());
    }


}
