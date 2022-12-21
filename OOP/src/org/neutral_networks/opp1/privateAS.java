package org.neutral_networks.opp1;

public class privateAS {
    // create components for contact list
    private String contactName;
    private String network;
    private int networkCode;
    private int number;

    private String email;


    // create getter setter method to access those components
    public void setContactName(String cName) {
        this.contactName = cName;
    }

    public String getContactname() {
        return this.contactName;
    }
}
