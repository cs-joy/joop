package org.neutral_networks.opp1;

public class privateAS {
    // create components for contact list
    private String contactName;
    private String network;
    private int networkCode;
    private String number;

    private String email;


    // create getter setter method to access those components
    public void setContactName(String cName) {
        this.contactName = cName;
    }

    public String getContactname() {
        return contactName;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetworkCode(int networkCode) {
        this.networkCode = networkCode;
    }

    public int getNetworkCode() {
        return networkCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
