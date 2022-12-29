package org.neutral_networks.interfaceAbstractClass.AbstractMethod;

public abstract class createAbstract {
    public abstract void printText(String text);

    public void printUser(String user) {
        System.out.println("hello, " + user);
    }

    private int var = 4;

    protected char mychar = 'j';

    public createAbstract(int var, char mychar) {
        this.var = var;
        this.mychar = mychar;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public char getMychar() {
        return mychar;
    }

    public void setMychar(char mychar) {
        this.mychar = mychar;
    }

    protected void car() {
        System.out.println("protected modifier");
    };

}
