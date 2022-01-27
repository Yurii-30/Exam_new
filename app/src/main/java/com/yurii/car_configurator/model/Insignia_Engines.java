package com.yurii.car_configurator.model;

public enum Insignia_Engines {
    ENG_1("1,8 L 140 HP"),
    ENG_2("1,6 L 160 HP"),
    ENG_3("2,0 L 249 HP"),
    ENG_4("2,0 L 160 HP"),
    ENG_5("2,0 L 163 HP");
    private String engine;

    Insignia_Engines (String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
