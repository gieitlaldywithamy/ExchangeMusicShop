package com.codeclan.amymorrison.shakespeare.instrumentstest;

import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Bass;
import com.codeclan.amymorrison.shakespeare.instruments.stockitems.instrumenttypes.Viola;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class IPlayeableTest {

    Viola viola;
    Bass bass;

    @Before
    public void before(){
        viola = new Viola(24.56, 45.60, false, "ex orchestra","wood", "tan", "colman");
        bass = new Bass(48.90, 85.90, true, "heavily used - lots of stickers and marks","wood", "maroon", "gibson");
    }

    @Test
    public void violaIsPlayable(){
        assertEquals("viola is playing", viola.play());
    }

    @Test
    public void bassIsPlayable(){
        assertEquals("bass is playing", bass.play());
    }

}
