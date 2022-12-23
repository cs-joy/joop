package org.neutral_networks.oop3;

public class Engine {
    private String model;
    private String rpm; // rpm = round per minute

    public Engine(String model, String rpm) {
        this.model = model;
        this.rpm = rpm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }
}
