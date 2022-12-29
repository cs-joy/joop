package org.neutral_networks.interfaceAbstractClass;

public interface introInterface {
    // here or inside of interface define, abstract method
    //public void printName(String name); //Modifier 'public' is redundant for interface members
    // hence, we do not(and we can't user private or protected modifier) use any access specifier inside an interface declaration
    // so,
    void printName(String name); // this is the signature of the printName method
}
