package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Compectation extends MainActivity {
    private String complectation;
    private Transmission transmission;
    private Engine engine;

    public Compectation(String complectation, Transmission transmission, Engine engine) {
        this.complectation = complectation;
        this.transmission = transmission;
        this.engine = engine;
    }

    public String getComplectation() {
        return complectation;
    }

    public void setComplectation(String complectation) {
        this.complectation = complectation;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
