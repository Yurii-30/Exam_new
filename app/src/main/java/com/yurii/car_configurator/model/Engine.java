package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Engine extends MainActivity {
    private Family family;
    private String engine_title;

    public Engine(Family family, String engine_title) {
        this.family = family;
        this.engine_title = engine_title;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getEngine_title() {
        return engine_title;
    }

    public void setEngine_title(String engine_title) {
        this.engine_title = engine_title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("family=").append(family);
        sb.append(", engine_title='").append(engine_title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
