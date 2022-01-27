package com.yurii.car_configurator.model;

import android.speech.tts.TextToSpeech;

import com.yurii.car_configurator.controller.MainActivity;

public class Final_car extends MainActivity {
    private Family family;
    private Engine engine;

    public Final_car(Family family, Engine engine) {
        this.family = family;
        this.engine = engine;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
