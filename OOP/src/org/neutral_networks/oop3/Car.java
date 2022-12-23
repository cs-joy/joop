package org.neutral_networks.oop3;

public class Car {
    private String name;
    private int doors;
    private String color;
    private Engine engine;

    public Car(String name, int doors, String color, Engine engine) {
        this.name = name;
        this.doors = doors;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
