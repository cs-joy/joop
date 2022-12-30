package org.neutral_networks.singletonPattern;

public class introDatabase {
    private String name;

    private static introDatabase instance;

    public static introDatabase getInstance(String name) {
        if (null == instance) {
            instance = new introDatabase(name);
            return instance;
        } else {
            return instance;
        }
    }

    public introDatabase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
