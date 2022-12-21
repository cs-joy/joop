package org.neutral_networks.opp1;

public class Phone {
    String name;
    int screenSize;
    int memorySize;
    int camera;

    private int price;
    private String pName;

    // create method
    public void playMusic(String trackName) {
        System.out.println("Playing \"" + trackName + "\"");
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }

    private String phoneName(String pname) {
        this.pName = pname;

        return pName;
    }

}
