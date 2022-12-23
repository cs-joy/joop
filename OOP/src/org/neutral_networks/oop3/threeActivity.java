package org.neutral_networks.oop3;

public class threeActivity {
    // composition in oop

    public static void main(String[] args) {
        Engine engine = new Engine("Renault", 8000);
        Car marcedes = new Car("Marcedes AMG", 2, "Silver", engine);


        // other way to define engine inside our Car() constructor
        // Car marcedes = new Car("Marcedes AMG", 2, "Silver", new Engine("Renault", 8000));
        // both way are equivalent


        // get name of the car
        System.out.println("Name: " + marcedes.getName());

        Engine engn = marcedes.getEngine();
        
        // get engine model of the car
        System.out.println("Engine Model: " + marcedes.getEngine().getModel());
    }

}
