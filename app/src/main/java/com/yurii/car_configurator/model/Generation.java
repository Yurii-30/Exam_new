package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Generation extends MainActivity {
    private String title;
    private Family family;

    public Generation(String title, Family family) {
        this.title = title;
        this.family = family;
    }

    public String getGenerationTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
