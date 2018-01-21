package com.codeclan.amymorrison.shakespeare;

import com.codeclan.amymorrison.shakespeare.instruments.stockitems.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Microphone microphone;
    PedalBoard pedalboard;

    @Before
    public void before() {
        microphone = new Microphone(4.50, 8.90, false, "subzero mic");
        pedalboard = new PedalBoard(32.30, 40.40, false, "stagg" );
    }

    @Test
    public void canGetDescription() {
        assertEquals("subzero mic", microphone.getDescription());
    }

    @Test
    public void canGetAccessoryType(){
        assertEquals("pedal board", pedalboard.getAccessoryType().getName());
    }
}
