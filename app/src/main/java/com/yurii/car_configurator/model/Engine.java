package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Engine extends MainActivity {
    private Model model;
    private float vol;
    private byte power;
    private boolean fuel;
    private String engine_title;

    public Engine(Model model, float vol, byte power, boolean fuel, String engine_title) {
        this.model = model;
        this.vol = vol;
        this.power = power;
        this.fuel = fuel;
        this.engine_title = engine_title;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
    }

    public byte getPower() {
        return power;
    }

    public void setPower(byte power) {
        this.power = power;
    }

    public boolean isFuel() {
        return fuel;
    }

    public void setFuel(boolean fuel) {
        this.fuel = fuel;
    }

    public String getEngine_title() {
        return engine_title;
    }

    public void setEngine_title(String engine_title) {
        this.engine_title = engine_title;
    }
}
