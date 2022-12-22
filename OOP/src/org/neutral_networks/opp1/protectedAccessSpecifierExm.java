package org.neutral_networks.opp1;

class protectedAccessSpecifier {
    private String productSerialNumber;
    private String productPrice;

    protected String name;
    protected String productQuantity;

    public String deck;

    public protectedAccessSpecifier() {

    }

    public protectedAccessSpecifier(String productSerialNumber, String productPrice) {
        this.productSerialNumber = productSerialNumber;
        this.productPrice = productPrice;
    }
    private void display() {
        System.out.println("Private method called");
    }

    public void publicMethod() {
        System.out.println("public method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductPrice() {
        return productPrice;
    }
}

public class protectedAccessSpecifierExm extends  protectedAccessSpecifier {
    protectedAccessSpecifier obj = new protectedAccessSpecifier();

    public void disPro() {
        String deckNo = obj.deck = "104A"; // public

        String productName = obj.name = "CPU";  // protected
        String productQuantity = obj.productQuantity = "1055";  // protected

        System.out.println("Deck No: " + deckNo);
        System.out.println("productName: " + productName);
        System.out.println("productQuantity: " + productQuantity);

        System.out.println("private variable access using constructor");
        protectedAccessSpecifier cons = new protectedAccessSpecifier("203.41.A65.011", "$1064");

        // get the value you re given via constructor
        String productSerialNumber = cons.getProductSerialNumber();
        System.out.println("productSerialNumber: " + productSerialNumber);

        String productPrice = cons.getProductPrice();
        System.out.println("productPrice: " + productPrice);
    }
}
