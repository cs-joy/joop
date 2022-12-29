package org.neutral_networks.interfaceAbstractClass.AbstractMethod;

public class cClass extends createAbstract {
    @Override
    public void printText(String text) {
        System.out.println(text);
    }

    @Override
    public void printUser(String user) {
        super.printUser(user);
    }

    @Override
    public int getVar() {
        return super.getVar();
    }

    @Override
    public void setVar(int var) {
        super.setVar(var);
    }

    @Override
    public char getMychar() {
        return super.getMychar();
    }

    @Override
    public void setMychar(char mychar) {
        super.setMychar(mychar);
    }

    public cClass(int var, char mychar) {
        super(var, mychar);
    }
}
