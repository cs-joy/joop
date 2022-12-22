package org.neutral_networks.oop2;

import java.security.PublicKey;

public class Dog {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    public Dog(String dogName, String dogColor, int dogLegs, boolean has_tale) {
        this.name = dogName;
        this.color = dogColor;
        this.legs = dogLegs;
        this.hasTale = has_tale;
    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }

    public void setName(String dog_name) {
        this.name = dog_name;
    }
    public String getName() {
        return name;
    }

    public void setColor(String dog_color) {
        this.color = dog_color;
    }
    public String getColor() {
        return color;
    }

    public void setLegs(int dog_legs) {
        this.legs = dog_legs;
    }
    public int getLegs() {
        return legs;
    }

    public void setHasTale(boolean has_tale) {
        this.hasTale = has_tale;
    }
    public boolean getHasTale() {
        return hasTale;
    }
}
