package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Color extends MainActivity {
    private String color;
    private Generation generation;

    public Color(String color, Generation generation) {
        this.color = color;
        this.generation = generation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }
}
