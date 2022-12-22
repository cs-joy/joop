package org.neutral_networks.ie;

class protectedSpecifier {
    protected int id;
    protected String name;
    protected String department;
    protected String session;

    protected void listStu() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Session: " + session);
    }
}
public class protect extends protectedSpecifier{
    public void inptuExtract() {
        id = 202010019;
        name = "Md. Zahangir Alam";
        department = "CSE";
        session = "SUM202";

        listStu();
    }
}
