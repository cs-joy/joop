package org.neutral_networks.oop_challange;

public class App {
    public static void main(String[] args) {
        Patient patient = new Patient("Mike", 28,
                new Eye("Left Eye", "Short sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Skyblue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned", "White", 40));
    }
}
