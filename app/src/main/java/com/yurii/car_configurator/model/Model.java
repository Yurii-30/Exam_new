package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Model extends MainActivity {
    private Family family;
    private Generation generation;
    private String model;

    public Model(Family family, Generation generation, String model) {
        this.family = family;
        this.generation = generation;
        this.model = model;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
