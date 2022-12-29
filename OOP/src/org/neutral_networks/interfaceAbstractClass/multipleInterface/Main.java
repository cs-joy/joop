package org.neutral_networks.interfaceAbstractClass.multipleInterface;

public class Main {
    public static void main(String[] args) {
        // first interface
        Department dept = new CSE("Mike");
        dept.departmentStaff();

        // second interface
        Student dep = new CSE("A",202010015);
        dep.studentInfo();
    }
}
