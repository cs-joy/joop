package org.neutral_networks.interfaceAbstractClass.multipleInterface;

public class CSE implements Department, Student{ // you can able to implements multiple interface
    private String name;
    private int id;

    private String dHead;

    public CSE(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public CSE(String dHead) {
        this.dHead = dHead;
    }

    public String getdHead() {
        return dHead;
    }

    public void setdHead(String dHead) {
        this.dHead = dHead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void departmentStaff() {
        System.out.println("\tDepartment Info");
        System.out.println("\tName: " + this.getdHead());
    }

    @Override
    public void studentInfo() {
        System.out.println("\tStudent Info");
        System.out.println("\tName: " + this.getName() +
                           "\n\tId: " + this.getId());
    }
}
