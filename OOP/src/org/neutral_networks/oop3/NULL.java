package org.neutral_networks.oop3;

public class NULL {
    // definition of null
    public static void main(String[] args) {
        Car marcedes = null;

        // when objects is null generally we can not perform any type of operation. for example:
        // we can not use the `getName()` method inside the `marcedes` object
        marcedes.getName(); // get Run Time error: NullPointerException
    }
}
