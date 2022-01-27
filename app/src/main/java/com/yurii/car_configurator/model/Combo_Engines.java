package com.yurii.car_configurator.model;

public enum Combo_Engines {
    ENG_1("1,6 L 90 HP"),
    ENG_2("1,5 L 115 HP");
    private String engine;

    Combo_Engines(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
