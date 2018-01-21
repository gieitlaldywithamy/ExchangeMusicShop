package com.codeclan.amymorrison.shakespeare.instruments.stockitems;


public enum AccessoryType {

    PEDALBOARD("pedal board"),
    MICROPHONE("microphone"),
    SHEETMUSIC("sheet music");

    private final String name;

    AccessoryType(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
