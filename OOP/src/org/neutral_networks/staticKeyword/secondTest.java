package org.neutral_networks.staticKeyword;

public class secondTest { // here modifier "private" and "static"  not allowed here
    private int id;
    private int age;
    private class innerClass { // here is private and static both modifier allowed here in inner class definition,
        // private static class innerClass - allowed here
        private String name;

        public innerClass(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age: " + age);
        }
    }
}
