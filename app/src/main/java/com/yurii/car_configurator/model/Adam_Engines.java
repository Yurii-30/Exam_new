package com.yurii.car_configurator.model;

public enum Adam_Engines {
    ENG_1("1,2L 69 HP"),
    ENG_2("1,4 L 87 HP"),
    ENG_3("1,4 L 100 HP"),
    ENG_4("1,0 L 90 HP");

    private String engine;

    Adam_Engines(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
