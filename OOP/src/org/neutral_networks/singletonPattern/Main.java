package org.neutral_networks.singletonPattern;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("Jahangir");

        Database testDatabase = new Database("JS");

    }
}
