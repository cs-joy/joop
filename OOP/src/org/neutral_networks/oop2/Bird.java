package org.neutral_networks.oop2;

public class Bird extends Animal{
    private int wings;
    public Bird(String animalName, String animalColor, int animalLegs, boolean has_tale, int birdWings) {
        super(animalName, animalColor, animalLegs, has_tale);
        this.wings = birdWings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    // new method
    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }

    // change or updated the behaviour of a method in parent class (here Animal)

    @Override
    public void eat(String food) {
        //super.eat(food); // output: Eating Meat where Meat is a food

        System.out.println("Chewing " + food);
    }
}
