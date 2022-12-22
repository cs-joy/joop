package org.neutral_networks.ie;

public class Recursion {
    private int number;

    public int sum(int k) {
        if(k > 0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return sum(number);
    }
}
