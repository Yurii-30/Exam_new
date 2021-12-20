package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Transmission extends MainActivity {
    private Generation generation;
    private String transmission;

    public Transmission(Generation generation, String transmission) {
        this.generation = generation;
        this.transmission = transmission;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
