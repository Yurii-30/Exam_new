package com.yurii.car_configurator.model;

import com.yurii.car_configurator.controller.MainActivity;

public class Family extends MainActivity {
    private String title;

    public Family(String title) {
        this.title = title;
    }

    public String getFamily() {
        return title;
    }

    public void setFamily(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Family{");
        sb.append("family='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
