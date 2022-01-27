package com.yurii.car_configurator.model;

public enum Corsa_Engines
{
    ENG_1("1,0 L 90 HP"),
    ENG_2("1,0 L 115 HP"),
    ENG_3("1,2 L 70 HP"),
    ENG_4("1,4 L 90 HP"),
    ENG_5("1,4 L 100 HP"),
    ENG_6("1,3 L 75 HP CDTI");
    private String engine;

    Corsa_Engines(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
