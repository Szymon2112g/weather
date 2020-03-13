package com.learn.api.weather.model.Forecast;

public class Sys {
    private String pod;

    public Sys() {
    }

    public Sys(String pod) {
        this.pod = pod;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }
}
