package com.yurii.car_configurator.model;

public enum Astra_Engines {
    ENG_1("1,0 L 105 HP"),
    ENG_2("1,4 L 100 HP"),
    ENG_3("1,4 L 125 HP"),
    ENG_4("1,6 L 200 HP");

    private String engine;

    Astra_Engines(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
