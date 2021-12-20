package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Family extends MainActivity {
    private String family;

    public Family(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Family{");
        sb.append("family='").append(family).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
