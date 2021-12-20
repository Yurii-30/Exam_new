package com.yurii.car_configurator.model;

import android.speech.tts.TextToSpeech;

import com.yurii.car_configurator.controller.MainActivity;

public class Final_car extends MainActivity {
    private Family family;
    private Generation generation;
    private Model model;
    private Engine engine;
    private Compectation compectation;
    private Color color;

    public Final_car(Family family, Generation generation, Model model, Engine engine, Compectation compectation, Color color) {
        this.family = family;
        this.generation = generation;
        this.model = model;
        this.engine = engine;
        this.compectation = compectation;
        this.color = color;
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Compectation getCompectation() {
        return compectation;
    }

    public void setCompectation(Compectation compectation) {
        this.compectation = compectation;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
