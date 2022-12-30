package org.neutral_networks.singletonPattern;

public class Main {
    public static void main(String[] args) {
        introDatabase database = introDatabase.getInstance("Jahangir");

        introDatabase testDatabase = new introDatabase("JS");

    }
}
